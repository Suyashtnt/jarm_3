package com.tnt_man_inc.jarm_3.items

import com.tnt_man_inc.jarm_3.Registries
import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.world.item.Item
import java.lang.AssertionError

object NetheriteInfusedStrongGuildedDiamond {
    val NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND = Registries.ITEMS.register("netherite_infused_strong_guilded_diamond") { BaseItem(Item.Properties().fireResistant()) }
    fun init() {}
}