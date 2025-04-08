package net.java_rin.afterdayzvault.addon.block;

import net.java_rin.afterdayzvault.AfterDayZVault;
import net.java_rin.afterdayzvault.addon.BlockRegistry;
import net.java_rin.afterdayzvault.addon.ItemRegistry;
import net.java_rin.afterdayzvault.util.ItemModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;

public class VaultBlock extends Block implements ItemModel {

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public VaultBlock() {
        super(Material.IRON);
        this.setTranslationKey("vault_block");
        this.setRegistryName("vault_block");
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        this.setHardness(35L);
        this.setResistance(15L);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));

        BlockRegistry.BLOCKS.add(this);
        ItemRegistry.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        AfterDayZVault.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
