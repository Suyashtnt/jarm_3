package com.tnt_man_inc.jarm_3.items

import com.tnt_man_inc.jarm_3.Registries
import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import java.lang.AssertionError

object NISGDApple {
    val NISGD_APPLE = Registries.ITEMS.register("nisgd_apple") {
        BaseItem(Item.Properties().food(FoodProperties.Builder()
                .nutrition(8).saturationMod(6f)
                .effect(MobEffectInstance(MobEffects.REGENERATION, 20 * 60, 5), 1f)
                .effect(MobEffectInstance(MobEffects.ABSORPTION, 20 * 60 * 4, 6), 1f)
                .effect(MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20 * 600, 0), 1f)
                .effect(MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20 * 600, 4), 1f).build()
        ))
    }

    fun init() {}
}