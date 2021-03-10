package xyz.damt;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

/*
    Viper Scoreboard API
    Created by damt
    Telegram: https://t.me/therealdamt
 */

public class ViperTask extends BukkitRunnable {

    private final Viper viper;

    public ViperTask(Viper viper) {
        this.viper = viper;
    }

    @Override
    public void run() {
        Bukkit.getOnlinePlayers().forEach(viper::createScoreboard);
    }

}
