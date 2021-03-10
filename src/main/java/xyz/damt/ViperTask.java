package xyz.damt;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

/**
 @since 3/10/2021
 @author damt
 @Note Telegram: t.me/therealdamt
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
