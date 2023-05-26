// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import de.dermacuser.Plugin;
import de.dermacuser.util.messages;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.Listener;

public class Teleporter implements Listener
{
    @EventHandler
    public void onClick(final PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        if (e.getItem() != null && e.getItem().hasItemMeta() && e.getItem() != null) {
            if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lTeleporter")) {
                e.getAction();
                if (Action.PHYSICAL != null) {
                    p.sendMessage(messages.Prefix + " Derzeit nicht verf\u00fcgbar");
                    e.setCancelled(true);
                    if (Plugin.getPlugin().getConfig().getBoolean("Lobby.devmode")) {
                        p.sendMessage("DEBUG-Teleporter-ITEMCLICK");
                    }
                }
            }
            if (e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§lCosmetics")) {
                e.getAction();
                if (Action.PHYSICAL != null) {
                    p.sendMessage(messages.Prefix + " Derzeit nicht verf\u00fcgbar");
                    e.setCancelled(true);
                    if (Plugin.getPlugin().getConfig().getBoolean("Lobby.devmode")) {
                        p.sendMessage("DEBUG-Teleporter-ITEMCLICK");
                    }
                }
            }
        }
    }
}
