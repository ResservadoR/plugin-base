package com.plugin.baseplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventJoinPlayer implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String username = player.getName();

        event.setJoinMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "[Join]" +
                ChatColor.WHITE + "Welcome" + username + "!");
    }
}
