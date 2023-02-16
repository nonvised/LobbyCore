package me.vaced.lobbycore;

import me.vaced.lobbycore.commands.*;
import me.vaced.lobbycore.listeners.BlockListener;
import me.vaced.lobbycore.listeners.DamageListener;
import me.vaced.lobbycore.listeners.JoinListener;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class LobbyCore extends JavaPlugin implements Listener {

    public ArrayList<Player> invisible_list = new ArrayList<>();

    @Override
    public void onEnable() {

        //config.yml
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getCommand("gmc").setExecutor(new gmcommand(this));
        getCommand("fly").setExecutor(new flycommand(this));
        getCommand("vanish").setExecutor(new vanishcommand(this));
        getCommand("core").setExecutor(new coreinfocommand(this));
        getCommand("corestaff").setExecutor(new coreinfostaffcommand(this));

        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new BlockListener(this), this);
        getServer().getPluginManager().registerEvents(new BlockListener(this), this);
        getServer().getPluginManager().registerEvents(new DamageListener(this), this);
    }
}
