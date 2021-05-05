package io.github.damt;

import org.bukkit.entity.Player;

import java.util.List;

/**
 @since 3/10/2021
 @author damt
 <p>
 <b>Note:</b> Telegram: t.me/therealdamt
 */

public interface ViperBoard {

    String getTitle();
    List<String> getLines(Player player);

}
