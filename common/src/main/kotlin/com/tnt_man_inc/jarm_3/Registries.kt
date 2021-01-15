package com.tnt_man_inc.jarm_3

import com.tnt_man_inc.jarm_3.items.NISGDApple
import me.shedaniel.architectury.registry.DeferredRegister
import net.minecraft.core.Registry
import java.lang.AssertionError

object Registries {
    const val MOD_ID = "jarm_3"
    val ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY)
    val BLOCKS = DeferredRegister.create(MOD_ID, Registry.BLOCK_REGISTRY)
}