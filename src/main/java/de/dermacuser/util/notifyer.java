// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.util;

import de.dermacuser.Plugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class notifyer
{
    public static void noti() {
        final Player p = (Player)Bukkit.getOnlinePlayers();
        if (Plugin.teamlog.contains(p.getUniqueId())) {
            p.sendMessage("Test");
        }
    }
}
