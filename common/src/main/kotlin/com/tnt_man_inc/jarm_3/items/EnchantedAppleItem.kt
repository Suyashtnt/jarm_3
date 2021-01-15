package com.tnt_man_inc.jarm_3.items

import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.world.item.ItemStack
import java.lang.AssertionError

class EnchantedAppleItem(properties: Properties) : BaseItem(properties) {
    override fun isFoil(itemStack: ItemStack): Boolean {
        return true
    }
}