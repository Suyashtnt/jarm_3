package com.tnt_man_inc.jarm_3.blocks;

import me.shedaniel.architectury.registry.RegistrySupplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

import static com.tnt_man_inc.jarm_3.Registries.BLOCKS;
import static com.tnt_man_inc.jarm_3.Registries.ITEMS;


public class RubyBlock {
    public static final RegistrySupplier<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)));
    public static final RegistrySupplier<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BaseBlockItem(RUBY_BLOCK.get(), new Item.Properties()));
    public static void init() {}
}
