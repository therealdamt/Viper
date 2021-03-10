package xyz.damt.example;

import org.bukkit.entity.Player;
import xyz.damt.ViperBoard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 @since 3/10/2021
 @author damt
 <p>
 <b>Note:</b> Telegram: t.me/therealdamt
 */

public class ViperAdapterExample extends ViperBoard {

    @Override
    public String getTitle() {
        return "Scoreboard!";
    }

    @Override
    public List<String> getLines(Player player) {
        List<String> lines = new ArrayList<>();
        lines.add("Name: " + player.getName());
        return lines;
    }
}
