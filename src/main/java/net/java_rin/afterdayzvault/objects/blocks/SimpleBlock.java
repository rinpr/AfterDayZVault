package net.java_rin.afterdayzvault.objects.blocks;

import net.java_rin.afterdayzvault.AfterDayZVault;
import net.java_rin.afterdayzvault.addon.BlockRegistry;
import net.java_rin.afterdayzvault.addon.ItemRegistry;
import net.java_rin.afterdayzvault.util.ItemModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class SimpleBlock extends Block implements ItemModel {

    public SimpleBlock(String name, Material material, CreativeTabs tab) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(tab);

        BlockRegistry.BLOCKS.add(this);
        ItemRegistry.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public SimpleBlock(String name, Material material, CreativeTabs tab, float hardness, float resistance) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setHardness(hardness);
        setResistance(resistance);

        BlockRegistry.BLOCKS.add(this);
        ItemRegistry.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        AfterDayZVault.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
