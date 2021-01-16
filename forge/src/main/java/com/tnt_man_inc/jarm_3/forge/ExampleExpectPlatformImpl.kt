package com.tnt_man_inc.jarm_3.forge

import com.tnt_man_inc.jarm_3.Jarm.init
import me.shedaniel.architectury.platform.forge.EventBuses
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext
import net.minecraftforge.fml.loading.FMLPaths
import java.io.File

object ExampleExpectPlatformImpl {
    /**
     * This is our actual method to [ExampleExpectPlatform.getConfigDirectory].
     */
    @JvmStatic
    fun getConfigDirectory(): File {
        return FMLPaths.CONFIGDIR.get().toFile()
    }
}