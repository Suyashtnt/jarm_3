package com.tnt_man_inc.jarm_3

import com.tnt_man_inc.jarm_3.blocks.BlockInitializer
import com.tnt_man_inc.jarm_3.items.ItemsInitializer
import com.tnt_man_inc.jarm_3.items.NISGDApple
import com.tnt_man_inc.jarm_3.items.Ruby
import me.shedaniel.architectury.registry.CreativeTabs
import net.minecraft.resources.ResourceLocation
import net.minecraft.util.LazyLoadedValue
import net.minecraft.world.item.ItemStack
import java.lang.AssertionError

object Jarm {
    val REGISTRIES = LazyLoadedValue { me.shedaniel.architectury.registry.Registries.get(Registries.MOD_ID) }
    val JARM_TAB = CreativeTabs.create(ResourceLocation(Registries.MOD_ID, "general")) { ItemStack(Ruby.RUBY_ITEM.get()) }

    @JvmStatic
    fun init() {
        BlockInitializer.init()
        ItemsInitializer.init()
        // register blocks first so BlockItems don't :crab: and cause an error
        Registries.BLOCKS.register()
        Registries.ITEMS.register()
        println(ExampleExpectPlatform.configDirectory.absolutePath)
    }
}