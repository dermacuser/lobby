// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.commands;

import de.dermacuser.util.messages;
import de.dermacuser.Plugin;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class GChatMute implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (sender instanceof Player) {
            if (p.hasPermission("lobby.gcmute")) {
                if (Plugin.GCMute) {
                    p.sendMessage(messages.Prefix + " §7Global Chat wurde entmuted");
                    Plugin.GCMute = false;
                }
                else {
                    p.sendMessage(messages.Prefix + " §7Global Chat wurde gemuted");
                    Plugin.GCMute = true;
                }
            }
            else {
                p.sendMessage(messages.nopermission);
            }
        }
        else {
            sender.sendMessage(messages.notpossible);
        }
        return false;
    }
}
