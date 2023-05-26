// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser;

import java.util.ArrayList;
import org.bukkit.scheduler.BukkitTask;
import de.dermacuser.listeners.ChatListener;
import de.dermacuser.listeners.WorldListener;
import de.dermacuser.listeners.InvListener;
import de.dermacuser.listeners.Teleporter;
import org.bukkit.event.Listener;
import de.dermacuser.items.ConnectionListener;
import de.dermacuser.commands.setup;
import de.dermacuser.commands.teamlog;
import de.dermacuser.commands.set;
import de.dermacuser.commands.ping;
import de.dermacuser.commands.GChatMute;
import de.dermacuser.commands.gamemode;
import de.dermacuser.commands.build;
import org.bukkit.command.CommandExecutor;
import de.dermacuser.commands.ConfigRL;
import de.dermacuser.task.AlwaysDay;
import java.util.UUID;
import java.util.List;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin
{
    private static final Logger LOGGER;
    private static Plugin plugin;
    public static List<UUID> teamlog;
    public static List<UUID> build;
    public static boolean GCMute;
    
    public static Plugin getPlugin() {
        return Plugin.plugin;
    }
    
    public void onEnable() {
        final BukkitTask KeepDay = new AlwaysDay(this).runTaskTimer((org.bukkit.plugin.Plugin)this, 0L, 100L);
        Plugin.plugin = this;
        Plugin.LOGGER.info("lobby enabled");
        this.loadconfig();
        this.getCommand("lobbyrl").setExecutor((CommandExecutor)new ConfigRL());
        this.getCommand("build").setExecutor((CommandExecutor)new build());
        this.getCommand("gm").setExecutor((CommandExecutor)new gamemode());
        this.getCommand("gmute").setExecutor((CommandExecutor)new GChatMute());
        this.getCommand("ping").setExecutor((CommandExecutor)new ping());
        this.getCommand("set").setExecutor((CommandExecutor)new set());
        this.getCommand("tl").setExecutor((CommandExecutor)new teamlog());
        this.getCommand("setup").setExecutor((CommandExecutor)new setup());
        this.getServer().getPluginManager().registerEvents((Listener)new ConnectionListener(), (org.bukkit.plugin.Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new Teleporter(), (org.bukkit.plugin.Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new InvListener(), (org.bukkit.plugin.Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new WorldListener(), (org.bukkit.plugin.Plugin)this);
        this.getServer().getPluginManager().registerEvents((Listener)new ChatListener(), (org.bukkit.plugin.Plugin)this);
    }
    
    private void loadconfig() {
        this.saveDefaultConfig();
    }
    
    public void onDisable() {
        Plugin.LOGGER.info("lobby disabled");
    }
    
    static {
        LOGGER = Logger.getLogger("lobby");
        Plugin.teamlog = new ArrayList<UUID>();
        Plugin.build = new ArrayList<UUID>();
    }
}
