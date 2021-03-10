package xyz.damt;

import org.bukkit.entity.Player;

import java.util.List;

/*
    Viper Scoreboard API
    Created by damt
    Telegram: https://t.me/therealdamt
 */

public abstract class ViperBoard {

    public abstract String getTitle();
    public abstract List<String> getLines(Player player);

}
