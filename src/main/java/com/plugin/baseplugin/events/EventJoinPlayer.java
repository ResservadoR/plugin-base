package com.plugin.baseplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventJoinPlayer implements Listener {
    Player player;
    String username = player.getName();

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "[Join]" +
                ChatColor.WHITE + "Welcome" + username + "!");
    }
}
