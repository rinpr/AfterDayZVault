package net.java_rin.afterdayzvault.objects.blocks;

import net.java_rin.afterdayzvault.AfterDayZVault;
import net.java_rin.afterdayzvault.init.BlockInit;
import net.java_rin.afterdayzvault.init.ItemInit;
import net.java_rin.afterdayzvault.util.ItemModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements ItemModel {

    public BlockBase(String name, Material material, CreativeTabs tab) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(tab);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public BlockBase(String name, Material material, CreativeTabs tab, float hardness, float resistance) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setHardness(hardness);
        setResistance(resistance);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        AfterDayZVault.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
