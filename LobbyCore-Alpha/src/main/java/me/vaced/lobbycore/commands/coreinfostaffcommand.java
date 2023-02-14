package me.vaced.lobbycore.commands;

import me.vaced.lobbycore.LobbyCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class coreinfostaffcommand implements CommandExecutor {

    private final LobbyCore plugin;

    public coreinfostaffcommand(LobbyCore plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("core.command.info.staff")){
                player.sendMessage("§7Running §bLobbyCore §7by Vaced_");
                player.sendMessage("§b/fly §7Attiva la modalità volo");
                player.sendMessage("§b/gmc §7Attiva e Disattiva la creative mode");
                player.sendMessage("§b/vanish §7Attiva e Disattiva la modallità invisibile");
            }
        }

        return false;
    }
}
