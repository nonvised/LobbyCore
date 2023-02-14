package me.vaced.lobbycore.commands;

import me.vaced.lobbycore.LobbyCore;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class vanishcommand implements CommandExecutor {

    private final LobbyCore plugin;

    public vanishcommand(LobbyCore plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("core.command.vanish")){
                if (plugin.invisible_list.contains(player)){
                    for (Player people : Bukkit.getOnlinePlayers()){
                        people.showPlayer(player);
                    }
                    plugin.invisible_list.remove(player);

                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("VanishDisable")));
                }else if(!plugin.invisible_list.contains(player)){
                    for (Player people : Bukkit.getOnlinePlayers()){
                        people.hidePlayer(player);
                    }
                    plugin.invisible_list.add(player);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("VanishEnable")));
                }
            }

        }
        return false;
    }
}
