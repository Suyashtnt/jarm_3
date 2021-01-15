package com.tnt_man_inc.jarm_3.items

import com.tnt_man_inc.jarm_3.Registries
import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.world.item.Item
import java.lang.AssertionError

object RubyNugget {
    val RUBY_NUGGET = Registries.ITEMS.register("ruby_nugget") { Item(Item.Properties()) }
    fun init() {}
}