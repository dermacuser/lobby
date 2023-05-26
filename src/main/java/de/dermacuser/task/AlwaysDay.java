// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.task;

import org.bukkit.Bukkit;
import de.dermacuser.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class AlwaysDay extends BukkitRunnable
{
    Plugin plugin;
    
    public AlwaysDay(final Plugin plugin) {
        this.plugin = plugin;
    }
    
    public void run() {
        Bukkit.getServer().getWorld(Plugin.getPlugin().getConfig().getString("Lobby.lobbyworld")).setTime(1000L);
    }
}
