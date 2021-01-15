package com.tnt_man_inc.jarm_3.items;

import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.world.item.Item;

import static com.tnt_man_inc.jarm_3.Registries.ITEMS;

public class StrongDiamond {
    public static final RegistrySupplier<Item> STRONG_DIAMOND = ITEMS.register("strong_diamond", () -> new BaseItem(new Item.Properties()));
    public static void init() {}
}
