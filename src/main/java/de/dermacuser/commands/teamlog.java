// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.commands;

import de.dermacuser.util.messages;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class teamlog implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final Player p = (Player)sender;
        p.sendMessage(messages.Prefix + " Derzeit nicht verf\u00fcgbar");
        return false;
    }
}
