package me.vaced.lobbycore.commands;

import me.vaced.lobbycore.LobbyCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.*;
import org.bukkit.ChatColor;

public class flycommand implements CommandExecutor {

    private final LobbyCore plugin;

    public flycommand(LobbyCore plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("core.command.fly")) {
                if (player.getAllowFlight()) {
                    player.setAllowFlight(false);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("FlyDisable")));
                } else {
                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("FlyEnable")));
                }
            }
        }
        return true;
    }
}