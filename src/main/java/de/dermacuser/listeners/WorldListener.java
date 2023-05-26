// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.listeners;

import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.entity.Player;
import de.dermacuser.Plugin;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.Listener;

public class WorldListener implements Listener
{
    @EventHandler
    public void onWeatherChange(final WeatherChangeEvent e) {
        e.setCancelled(true);
    }
    
    @EventHandler
    public void onBlockPlace(final BlockPlaceEvent e) {
        final Player p = e.getPlayer();
        if (Plugin.build.contains(p.getUniqueId())) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onBlockBreak(final BlockBreakEvent e) {
        final Player p = e.getPlayer();
        if (Plugin.build.contains(p.getUniqueId())) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onDamage(final EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onfood(final FoodLevelChangeEvent e) {
        e.setCancelled(true);
    }
    
    @EventHandler
    public void onPickUp(final PlayerPickupItemEvent e) {
        final Player p = e.getPlayer();
        if (Plugin.build.contains(p.getUniqueId())) {
            e.setCancelled(false);
        }
        else {
            e.setCancelled(true);
        }
    }
}
