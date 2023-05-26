// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.commands;

import de.dermacuser.util.messages;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class ping implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final Player p = (Player)sender;
        final int good = 30;
        if (p.getPing() < good) {
            p.sendMessage(messages.Prefix + " Dein Ping ist §a" + p.getPing() + "§7ms");
        }
        else if (p.getPing() > good) {
            p.sendMessage(messages.Prefix + " Dein Ping ist §c" + p.getPing() + "§7ms");
        }
        return false;
    }
}
