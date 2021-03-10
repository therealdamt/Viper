package xyz.damt;

import org.bukkit.entity.Player;

import java.util.List;

public abstract class ViperBoard {

    public abstract String getTitle();
    public abstract List<String> getLines(Player player);

}
