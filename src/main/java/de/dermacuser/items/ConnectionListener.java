// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.items;

import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import de.dermacuser.util.messages;
import org.bukkit.Location;
import org.bukkit.Bukkit;
import de.dermacuser.Plugin;
import de.dermacuser.inventorys.InvManager;
import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.SoundCategory;
import org.bukkit.Sound;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.Listener;

public class ConnectionListener implements Listener
{
    @EventHandler
    public void onJoin(final PlayerJoinEvent e) {
        e.setJoinMessage((String)null);
        final Player p = e.getPlayer();
        p.playSound((Entity)p, Sound.BLOCK_BEACON_ACTIVATE, SoundCategory.PLAYERS, 1000.0f, 1.0f);
        p.setGameMode(GameMode.SURVIVAL);
        p.getInventory().clear();
        InvManager.getJoinItems(p);
        p.setLevel(0);
        p.setLevel(2023);
        final FileConfiguration config = Plugin.getPlugin().getConfig();
        final World world = Bukkit.getWorld(config.getString("Lobby.lobbyworld"));
        final double X = config.getDouble("Spawnloc.X");
        final double Y = config.getDouble("Spawnloc.Y");
        final double Z = config.getDouble("Spawnloc.Z");
        final float Pitch = (float)config.getDouble("Spawnloc.Pitch");
        final float Yaw = (float)config.getDouble("Spawnloc.Yaw");
        final Location spawn = new Location(world, X, Y, Z, Yaw, Pitch);
        p.teleport(spawn);
        if (p.hasPermission("lobby.fly")) {
            p.setAllowFlight(true);
        }
        if (Plugin.getPlugin().getConfig().getBoolean("Lobby.devmode")) {
            p.sendTitle(messages.joineventtitle, messages.joineventdevsubtitle, 10, 40, 10);
        }
        else if (!Plugin.getPlugin().getConfig().getBoolean("Lobby.devmode")) {
            p.sendTitle(messages.joineventtitle, messages.joineventsubtitle, 10, 30, 10);
        }
    }
    
    @EventHandler
    public void onQuit(final PlayerQuitEvent e) {
        final Player p = e.getPlayer();
        Plugin.build.remove(p.getUniqueId());
        e.setQuitMessage((String)null);
    }
}
