package com.tnt_man_inc.jarm_3.items

import com.tnt_man_inc.jarm_3.Registries
import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.entity.Entity
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import java.lang.AssertionError

object RubyShard {
    val RUBY_SHARD = Registries.ITEMS.register("ruby_shard") { RubyShardItem(Item.Properties()) }
    fun init() {}
}

internal class RubyShardItem(properties: Properties) : BaseItem(properties) {
    override fun inventoryTick(itemStack: ItemStack, level: Level, entity: Entity, i: Int, bl: Boolean) {
        super.inventoryTick(itemStack, level, entity, i, bl)
        if (entity is ServerPlayer) {
            entity.addEffect(MobEffectInstance(MobEffects.WEAKNESS, 1, 0))
        }
    }
}