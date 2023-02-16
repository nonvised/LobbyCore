package me.vaced.lobbycore.listeners;

import me.vaced.lobbycore.LobbyCore;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {



    private final LobbyCore plugin;

    public JoinListener(LobbyCore plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        for (int i = 0; 1 < plugin.invisible_list.size(); i++){
            player.hidePlayer(plugin.invisible_list.get(i));
        }
    }
}
