package io.github.damt.example;

import io.github.damt.Viper;
import org.bukkit.plugin.java.JavaPlugin;

/**
 @since 3/10/2021
 @author damt
 <p>
 <b>Note:</b> Telegram: t.me/therealdamt
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
