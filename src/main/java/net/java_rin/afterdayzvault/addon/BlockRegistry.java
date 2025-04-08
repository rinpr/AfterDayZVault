package net.java_rin.afterdayzvault.addon;

import net.java_rin.afterdayzvault.addon.block.VaultBlock;
import net.java_rin.afterdayzvault.objects.blocks.SimpleBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class BlockRegistry {

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block COPPER_BLOCK = new SimpleBlock("copper_block", Material.IRON, CreativeTabs.BUILDING_BLOCKS, 3L, 6L);
    public static final Block VAULT_BLOCK = new VaultBlock();
}