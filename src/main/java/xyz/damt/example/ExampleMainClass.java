package xyz.damt.example;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.damt.Viper;

/**
 @since 3/10/2021
 @author damt
 @Note Telegram: t.me/therealdamt
*/

public class ExampleMainClass extends JavaPlugin {

    @Override
    public void onEnable() {

        new Viper(this, new ViperAdapterExample(), 10);

        /**
        Time = Long Time
        Adapter = Your Scoreboard Adapter (Must extend {@link ViperBoard} )
        Plugin = Your Java Main Class
         */

    }

}
