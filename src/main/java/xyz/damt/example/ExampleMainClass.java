package xyz.damt.example;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.damt.Viper;

/*
    Viper Scoreboard API
    Created by damt
    Telegram: https://t.me/therealdamt
 */

public class ExampleMainClass extends JavaPlugin {

    @Override
    public void onEnable() {

        new Viper(this, new ViperAdapterExample(), 10);

        /*
        Time = Long Time
        Adapter = Your Scoreboard Adapter (Must extend @ViperBoard)
        Plugin = Your Java Main Class
         */

    }

}
