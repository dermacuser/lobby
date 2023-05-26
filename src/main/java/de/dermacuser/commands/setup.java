// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.commands;

import de.dermacuser.inventorys.InvManager;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class setup implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (p.hasPermission("lobby.set")) {
            InvManager.setupInv(p);
        }
        return false;
    }
}
