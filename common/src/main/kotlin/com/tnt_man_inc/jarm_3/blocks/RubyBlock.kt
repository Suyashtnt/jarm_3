package com.tnt_man_inc.jarm_3.blocks

import com.tnt_man_inc.jarm_3.Registries
import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.material.Material
import java.lang.AssertionError

object RubyBlock {
    val RUBY_BLOCK = Registries.BLOCKS.register("ruby_block") { Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)) }
    val RUBY_BLOCK_ITEM = Registries.ITEMS.register("ruby_block") { BaseBlockItem(RUBY_BLOCK.get(), Item.Properties()) }
    fun init() {}
}