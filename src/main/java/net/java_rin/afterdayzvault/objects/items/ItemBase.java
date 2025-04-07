package net.java_rin.afterdayzvault.objects.items;

import net.java_rin.afterdayzvault.AfterDayZVault;
import net.java_rin.afterdayzvault.addon.ItemRegistry;
import net.java_rin.afterdayzvault.util.ItemModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ItemModel {

    public ItemBase(String name, CreativeTabs tabs) {
        this.setTranslationKey(name);
        this.setRegistryName(name);
        this.setCreativeTab(tabs);

        ItemRegistry.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        AfterDayZVault.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
