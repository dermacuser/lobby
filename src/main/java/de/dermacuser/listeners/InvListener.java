// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.listeners;

import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.Location;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import de.dermacuser.Plugin;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.Listener;

public class InvListener implements Listener
{
    @EventHandler
    public void onDrop(final PlayerDropItemEvent e) {
        final Player p = e.getPlayer();
        if (Plugin.build.contains(p.getUniqueId())) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onInv(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
        if (e.getWhoClicked() instanceof Player) {
            if (Plugin.build.contains(e.getWhoClicked().getUniqueId())) {
                e.setCancelled(false);
            }
            else {
                e.setCancelled(true);
            }
            if (e.getCurrentItem() != null) {
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Plugin.getPlugin().getConfig().getString("Spawn.name"))) {
                    final FileConfiguration config = Plugin.getPlugin().getConfig();
                    final World world = Bukkit.getWorld(config.getString("Lobby.lobbyworld"));
                    final double X = config.getDouble("Spawnloc.X");
                    final double Y = config.getDouble("Spawnloc.Y");
                    final double Z = config.getDouble("Spawnloc.Z");
                    final float Pitch = (float)config.getDouble("Spawnloc.Pitch");
                    final float Yaw = (float)config.getDouble("Spawnloc.Yaw");
                    final Location location = new Location(world, X, Y, Z, Yaw, Pitch);
                    p.teleport(location);
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Plugin.getPlugin().getConfig().getString("Grassblock.name"))) {
                    final FileConfiguration config = Plugin.getPlugin().getConfig();
                    final World world = Bukkit.getWorld(config.getString("Lobby.lobbyworld"));
                    final double X = config.getDouble("Grassblockloc.X");
                    final double Y = config.getDouble("Grassblockloc.Y");
                    final double Z = config.getDouble("Grassblockloc.Z");
                    final float Pitch = (float)config.getDouble("Grassblockloc.Pitch");
                    final float Yaw = (float)config.getDouble("Grassblockloc.Yaw");
                    final Location location = new Location(world, X, Y, Z, Yaw, Pitch);
                    p.teleport(location);
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Plugin.getPlugin().getConfig().getString("Emerald.name"))) {
                    final FileConfiguration config = Plugin.getPlugin().getConfig();
                    final World world = Bukkit.getWorld(config.getString("Lobby.lobbyworld"));
                    final double X = config.getDouble("Emeraldloc.X");
                    final double Y = config.getDouble("Emeraldloc.Y");
                    final double Z = config.getDouble("Emeraldloc.Z");
                    final float Pitch = (float)config.getDouble("Emeraldloc.Pitch");
                    final float Yaw = (float)config.getDouble("Emeraldloc.Yaw");
                    final Location location = new Location(world, X, Y, Z, Yaw, Pitch);
                    p.teleport(location);
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Plugin.getPlugin().getConfig().getString("Bed.name"))) {
                    final FileConfiguration config = Plugin.getPlugin().getConfig();
                    final World world = Bukkit.getWorld(config.getString("Lobby.lobbyworld"));
                    final double X = config.getDouble("Bedloc.X");
                    final double Y = config.getDouble("Bedloc.Y");
                    final double Z = config.getDouble("Bedloc.Z");
                    final float Pitch = (float)config.getDouble("Bedloc.Pitch");
                    final float Yaw = (float)config.getDouble("Bedloc.Yaw");
                    final Location location = new Location(world, X, Y, Z, Yaw, Pitch);
                    p.teleport(location);
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Plugin.getPlugin().getConfig().getString("Rod.name"))) {
                    final FileConfiguration config = Plugin.getPlugin().getConfig();
                    final World world = Bukkit.getWorld(config.getString("Lobby.lobbyworld"));
                    final double X = config.getDouble("Rodloc.X");
                    final double Y = config.getDouble("Rodloc.Y");
                    final double Z = config.getDouble("Rodloc.Z");
                    final float Pitch = (float)config.getDouble("Rodloc.Pitch");
                    final float Yaw = (float)config.getDouble("Rodloc.Yaw");
                    final Location location = new Location(world, X, Y, Z, Yaw, Pitch);
                    p.teleport(location);
                }
            }
        }
    }
}
