package com.tnt_man_inc.jarm_3.items

import com.tnt_man_inc.jarm_3.Registries
import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import java.lang.AssertionError

object RubyApple {
    val RUBY_APPLE = Registries.ITEMS.register("ruby_apple") {
        BaseItem(Item.Properties().food(FoodProperties.Builder()
                .nutrition(8)
                .saturationMod(6f)
                .effect(MobEffectInstance(MobEffects.REGENERATION, 20 * 8, 1), 1f)
                .effect(MobEffectInstance(MobEffects.ABSORPTION, 20 * 60 * 2, 3), 1f)
                .effect(MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 300, 0), 1f)
                .effect(MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 300, 0), 1f)
                .build()
        ))
    }

    fun init() {}
}