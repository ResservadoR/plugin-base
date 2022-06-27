package com.plugin.baseplugin;

import com.plugin.baseplugin.commands.CommandMessageClient;
import com.plugin.baseplugin.events.EventJoinPlayer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("I'm ready, Spigot!");

        // Calling Methods of Registers

        // Register Commands
        registerCommands();
        //Register Events
        registerEvents();
    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye! Spigot");
    }

    // Update Register Commands - Here us find the commandos registered
    public void registerCommands() {
        // Is created a variable of string, with the method of Bukkit .getCommand("String")
        // and is created an object calling the main of command with the method .setExecuter(new import_command)
        getCommand("msgClient").setExecutor(new CommandMessageClient());
    }

    // Update Register Events - here us find the events registered
    public void registerEvents() {
        // Is called the events with the method by Bukkit (Bukkit.getPluginManager.registerEvents()).
        // for register the events existing, later is event calling, and it is called in the method
        // .registerEvents(new class_event(), this).
        // The "this", refers to the plugin (main).
        Bukkit.getPluginManager().registerEvents(new EventJoinPlayer(), this);
    }
}
