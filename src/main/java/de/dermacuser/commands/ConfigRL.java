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

public class ConfigRL implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (sender instanceof Player) {
            if (p.hasPermission("lobby.reloadconfig")) {
                Plugin.getPlugin().reloadConfig();
                p.sendMessage("Default config reloaded!");
            }
            else {
                p.sendMessage(messages.nopermission);
            }
        }
        else {
            Plugin.getPlugin().reloadConfig();
            sender.sendMessage("Done!");
        }
        return false;
    }
}
