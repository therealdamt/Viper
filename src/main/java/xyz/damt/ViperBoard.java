package xyz.damt;

import org.bukkit.entity.Player;

import java.util.List;

/**
 @since 3/10/2021
 @author damt
 @Note Telegram: t.me/therealdamt
 */

public abstract class ViperBoard {

    public abstract String getTitle();
    public abstract List<String> getLines(Player player);

}
