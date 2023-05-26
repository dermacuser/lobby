// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import de.dermacuser.util.messages;
import de.dermacuser.Plugin;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.Listener;

public class ChatListener implements Listener
{
    @EventHandler
    public void onChat(final AsyncPlayerChatEvent e) {
        final Player p = e.getPlayer();
        if (Plugin.GCMute) {
            if (p.hasPermission("lobby.mutechat")) {
                e.setCancelled(false);
            }
            else {
                e.setCancelled(true);
                p.sendMessage(messages.Prefix + " §7Derzeit ist der Chat gemuted");
            }
        }
    }
}
