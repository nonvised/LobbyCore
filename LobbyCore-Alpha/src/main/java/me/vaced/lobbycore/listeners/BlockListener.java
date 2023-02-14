package me.vaced.lobbycore.listeners;

import me.vaced.lobbycore.LobbyCore;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {
    private final LobbyCore plugin;
    public BlockListener(LobbyCore plugin) {this.plugin = plugin;}

    @EventHandler
    public void onBlockBreak(BlockBreakEvent e){
        Player p = e.getPlayer();

        if(!e.isCancelled()){
            if(p.isOp()){
                e.setCancelled(true);
            }else {
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e){
        Player p = e.getPlayer();

        if(!e.isCancelled()){
            if(p.isOp()){
                e.setCancelled(true);
            }else {
                e.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onBlockBurn(BlockBurnEvent e){
        e.setCancelled(true);
    }
}
