// 
// Decompiled by Procyon v0.5.36
// 

package de.dermacuser.util;

import java.util.List;
import java.util.Arrays;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ItemStack;

public class ItemAPI
{
    private ItemStack item;
    private ItemMeta meta;
    
    public ItemAPI(final Material material) {
        this.item = new ItemStack(material, 1);
        this.meta = this.item.getItemMeta();
    }
    
    public ItemAPI(final Material material, final short subID) {
        this.item = new ItemStack(material, 1, subID);
        this.meta = this.item.getItemMeta();
    }
    
    public ItemAPI(final ItemStack itemStack) {
    }
    
    public ItemAPI setName(final String displayname) {
        this.meta.setDisplayName(displayname);
        return this;
    }
    
    public ItemAPI setLore(final String... lore) {
        this.meta.setLore((List)Arrays.asList(lore));
        return this;
    }
    
    public ItemStack build() {
        this.item.setItemMeta(this.meta);
        return this.item;
    }
}
