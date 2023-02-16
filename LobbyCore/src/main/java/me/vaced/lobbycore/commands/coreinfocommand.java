package me.vaced.lobbycore.commands;

import me.vaced.lobbycore.LobbyCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class coreinfocommand implements CommandExecutor {

    private final LobbyCore plugin;

    public coreinfocommand(LobbyCore plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("core.command.info.user")){
                player.sendMessage("§7Running §bLobbyCore §7by Vaced_");
                player.sendMessage("§cNon hai i permessi per i comandi staff.");
            }
        }

        return false;
    }
}
