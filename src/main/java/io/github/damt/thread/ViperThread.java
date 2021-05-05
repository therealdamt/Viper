package io.github.damt.thread;

import io.github.damt.Viper;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class ViperThread extends Thread {


    private final Viper instance;

    public ViperThread(Viper instance) {
        this.instance = instance;
        this.setDaemon(false);
        this.start();
    }

    @Override
    public void run() {

        try {
            for (Player player : Bukkit.getServer().getOnlinePlayers()) {
                this.instance.createScoreboard(player);
            }

            Thread.sleep(this.instance.getTime() * 50);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
