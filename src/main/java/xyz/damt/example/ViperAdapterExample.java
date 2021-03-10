package xyz.damt.example;

import org.bukkit.entity.Player;
import xyz.damt.ViperBoard;

import java.util.Arrays;
import java.util.List;

public class ViperAdapterExample extends ViperBoard {

    @Override
    public String getTitle() {
        return "Scoreboard!";
    }

    @Override
    public List<String> getLines(Player player) {
        return Arrays.asList("Hello", "hi", "ok");
    }
}
