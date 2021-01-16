package com.tnt_man_inc.jarm_3.forge

import com.tnt_man_inc.jarm_3.Jarm
import com.tnt_man_inc.jarm_3.Registries
import me.shedaniel.architectury.platform.forge.EventBuses
import net.minecraftforge.fml.common.Mod
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(Registries.MOD_ID)
class JarmForge {
    init {
        EventBuses.registerModEventBus(Registries.MOD_ID, MOD_BUS)
        Jarm.init()
    }
}