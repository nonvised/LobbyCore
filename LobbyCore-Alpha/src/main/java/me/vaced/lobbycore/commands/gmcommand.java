package me.vaced.lobbycore.commands;

import me.vaced.lobbycore.LobbyCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class gmcommand implements CommandExecutor {

    private final LobbyCore plugin;

    public gmcommand(LobbyCore plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p =(Player) sender;
        if(p.hasPermission("core.command.gm")){
            if(p.getGameMode() == GameMode.CREATIVE ){
                p.setGameMode(GameMode.SURVIVAL);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GamemodeDisable")));
            }else{
                p.setGameMode(GameMode.CREATIVE);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GamemodeEnable")));
            }
        }
        return false;
    }
}
