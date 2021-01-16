package com.tnt_man_inc.jarm_3.fabric

import com.tnt_man_inc.jarm_3.Jarm.init
import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader
import java.io.File

object ExampleExpectPlatformImpl {
    /**
     * This is our actual method to [ExampleExpectPlatform.getConfigDirectory].
     */
    @JvmStatic
    fun getConfigDirectory(): File {
        return FabricLoader.getInstance().configDir.toFile()
    }
}