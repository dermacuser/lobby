// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.commands;

import de.dermacuser.util.messages;
import org.bukkit.GameMode;
import de.dermacuser.inventorys.InvManager;
import de.dermacuser.Plugin;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class build implements CommandExecutor
{
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (sender instanceof Player) {
            if (p.hasPermission("lobby.build")) {
                if (Plugin.build.contains(p.getUniqueId())) {
                    Plugin.build.remove(p.getUniqueId());
                    p.getInventory().clear();
                    InvManager.getJoinItems(p);
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendTitle("§e§lBuild§6§lMode", "§c§lAus", 10, 10, 10);
                }
                else {
                    Plugin.build.add(p.getUniqueId());
                    p.sendTitle("§e§lBuild§6§lMode", "§a§lAn", 10, 10, 10);
                    p.setGameMode(GameMode.CREATIVE);
                    p.getInventory().clear();
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
