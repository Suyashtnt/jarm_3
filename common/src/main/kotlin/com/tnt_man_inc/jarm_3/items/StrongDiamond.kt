package com.tnt_man_inc.jarm_3.items

import com.tnt_man_inc.jarm_3.Registries
import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.world.item.Item
import java.lang.AssertionError

object StrongDiamond {
    val STRONG_DIAMOND = Registries.ITEMS.register("strong_diamond") { BaseItem(Item.Properties()) }
    fun init() {}
}