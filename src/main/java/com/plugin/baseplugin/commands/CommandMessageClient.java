package com.plugin.baseplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandMessageClient implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if(player.hasPermission("Command.Access.Plugin")) {
            if(sender instanceof Player) {
                player.sendMessage("Command Executed from Chat");
            } else {
                System.out.println("Command Executed from Console");
            }
        }

        return false;
    }
}
