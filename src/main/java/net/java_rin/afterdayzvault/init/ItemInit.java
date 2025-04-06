package net.java_rin.afterdayzvault.init;

import net.java_rin.afterdayzvault.objects.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    // use to store mod item from below
    public static final List<Item> ITEMS = new ArrayList<Item>();

    // mod item
    public static final Item COPPER_INGOT = new ItemBase("copper_ingot", CreativeTabs.MATERIALS);
}
