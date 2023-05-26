// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.inventorys;

import org.bukkit.configuration.file.FileConfiguration;
import de.dermacuser.Plugin;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.inventory.ItemStack;
import de.dermacuser.util.ItemAPI;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class InvManager
{
    public static void getJoinItems(final Player p) {
        p.getInventory().setItem(4, new ItemAPI(Material.RECOVERY_COMPASS).setName("§b§lTeleporter").build());
        final ItemStack item = new ItemStack(Material.PLAYER_HEAD, 1, (short)3);
        final SkullMeta skull = (SkullMeta)item.getItemMeta();
        skull.setDisplayName("§b§lCosmetics");
        skull.setOwner(p.getName());
        item.setItemMeta((ItemMeta)skull);
        p.getInventory().setItem(1, item);
    }
    
    public static Inventory setupInv(final Player p) {
        final Inventory setupInve = Bukkit.createInventory((InventoryHolder)null, InventoryType.CHEST, "§cLOBBY-SETUP");
        setupInve.setItem(0, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(1, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(2, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(3, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(4, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(5, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(6, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(7, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(8, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(9, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(17, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(18, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(19, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(20, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(21, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(22, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(23, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(24, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(25, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        setupInve.setItem(26, new ItemAPI(Material.RED_STAINED_GLASS_PANE).setName("").build());
        p.openInventory(setupInve);
        return setupInve;
    }
    
    public static Inventory getTPInv(final Player p) {
        final FileConfiguration config = Plugin.getPlugin().getConfig();
        final Inventory tpInv = Bukkit.createInventory((InventoryHolder)null, InventoryType.CHEST, Plugin.getPlugin().getConfig().getString("Inventory.Teleporter"));
        tpInv.setItem(1, new ItemAPI(Material.GRAY_STAINED_GLASS_PANE).setName(Plugin.getPlugin().getConfig().getString("TeleporterItem.Default")).build());
        tpInv.setItem(10, new ItemAPI(Material.GRAY_STAINED_GLASS_PANE).setName(Plugin.getPlugin().getConfig().getString("TeleporterItem.Default")).build());
        tpInv.setItem(19, new ItemAPI(Material.GRAY_STAINED_GLASS_PANE).setName(Plugin.getPlugin().getConfig().getString("TeleporterItem.Default")).build());
        tpInv.setItem(config.getInt("Spawn.slot"), new ItemAPI(Material.HONEY_BOTTLE).setName(config.getString("Spawn.name")).build());
        if (config.getBoolean("Grassblock.enable")) {
            tpInv.setItem(config.getInt("Grassblock.slot"), new ItemAPI(Material.GRASS_BLOCK).setName(config.getString("Grassblock.name")).build());
        }
        if (config.getBoolean("Emerald.enable")) {
            tpInv.setItem(config.getInt("Emerald.slot"), new ItemAPI(Material.EMERALD).setName(config.getString("Emerald.name")).build());
        }
        if (config.getBoolean("Bed.enable")) {
            tpInv.setItem(config.getInt("Bed.slot"), new ItemAPI(Material.RED_BED).setName(config.getString("Bed.name")).build());
        }
        if (config.getBoolean("Rod.enable")) {
            tpInv.setItem(config.getInt("Rod.slot"), new ItemAPI(Material.FISHING_ROD).setName(config.getString("Rod.name")).build());
        }
        p.openInventory(tpInv);
        return tpInv;
    }
}
