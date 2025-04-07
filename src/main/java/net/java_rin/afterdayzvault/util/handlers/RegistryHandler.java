package net.java_rin.afterdayzvault.util.handlers;

import net.java_rin.afterdayzvault.addon.BlockRegistry;
import net.java_rin.afterdayzvault.addon.ItemRegistry;
import net.java_rin.afterdayzvault.util.ItemModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {

    // register an item into the game
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemRegistry.ITEMS.toArray(new Item[0]));
    }

    // register an item block into the game
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockRegistry.BLOCKS.toArray(new Block[0]));
    }

    // register an item model into the game
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        // register an item
        for (Item item : ItemRegistry.ITEMS) {
            if (item instanceof ItemModel) {
                ((ItemModel) item).registerModels();
            }
        }
        // register an item block
        for (Block block : BlockRegistry.BLOCKS) {
            if (block instanceof ItemModel) {
                ((ItemModel) block).registerModels();
            }
        }
    }
}
