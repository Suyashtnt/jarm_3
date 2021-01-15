package com.tnt_man_inc.jarm_3.items

import com.tnt_man_inc.jarm_3.Registries
import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import java.lang.AssertionError

object EnchantedRubyApple {
    val ENCHANTED_RUBY_APPLE = Registries.ITEMS.register("enchanted_ruby_apple") {
        EnchantedAppleItem(Item.Properties().food(FoodProperties.Builder()
                .nutrition(8)
                .saturationMod(6f)
                .effect(MobEffectInstance(MobEffects.REGENERATION, 20 * 20, 2), 1f)
                .effect(MobEffectInstance(MobEffects.ABSORPTION, 20 * 260, 5), 1f)
                .effect(MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 600, 0), 1f)
                .effect(MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 600, 2), 1f)
                .build()
        ))
    }

    fun init() {}
}