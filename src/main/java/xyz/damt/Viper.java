package xyz.damt;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;

import java.util.*;

/**
 @since 3/10/2021
 @author damt
 @Note Telegram: t.me/therealdamt
 */


public class Viper implements Listener {

    public HashMap<UUID, List<String>> playerScoreboard = new HashMap<>();

    private final ViperBoard scoreboard;
    private final long time;

    public Viper(JavaPlugin plugin, ViperBoard scoreboard, long time) {
        this.scoreboard = scoreboard;
        this.time = time;

        new ViperTask(this).runTaskTimer(plugin, time, time);

        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public long getDuration() {
        return this.time;
    }

    public Collection<List<String>> getLists() {
        return playerScoreboard.values();
    }

    public void createScoreboard(Player player) {
        org.bukkit.scoreboard.Scoreboard board = Objects.requireNonNull(Bukkit.getScoreboardManager()).getNewScoreboard();
        Objective obj = board.registerNewObjective(scoreboard.getTitle(), "dummy");

        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        updateLines(player);

        List<String> list = playerScoreboard.get(player.getUniqueId());
        Collections.reverse(list);

        list.forEach(s -> {
            Score score = obj.getScore(s);
            score.setScore(list.indexOf(s));
        });


        player.setScoreboard(board);
    }

    public void updateLines(Player player) {
        playerScoreboard.remove(player.getUniqueId());
        playerScoreboard.put(player.getUniqueId(), scoreboard.getLines(player));
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        createScoreboard(e.getPlayer());
        playerScoreboard.put(e.getPlayer().getUniqueId(), scoreboard.getLines(e.getPlayer()));
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        playerScoreboard.remove(e.getPlayer().getUniqueId());
    }

}
