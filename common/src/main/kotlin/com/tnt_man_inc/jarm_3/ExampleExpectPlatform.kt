package com.tnt_man_inc.jarm_3

import com.tnt_man_inc.jarm_3.items.NISGDApple
import me.shedaniel.architectury.ExpectPlatform
import java.io.File
import java.lang.AssertionError

object ExampleExpectPlatform {// Just throw an error, the content should get replaced at runtime.
    /**
     * We can use [Platform.getConfigFolder] but this is just an example of [ExpectPlatform].
     *
     *
     * This must be a public static method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with `Impl`.
     *
     *
     * Example:
     * Expect: net.examplemod.ExampleExpectPlatform#getConfigDirectory()
     * Actual Fabric: net.examplemod.fabric.ExampleExpectPlatformImpl#getConfigDirectory()
     * Actual Forge: net.examplemod.forge.ExampleExpectPlatformImpl#getConfigDirectory()
     */
    @JvmStatic
    @get:ExpectPlatform
    val configDirectory: File
        get() {
            // Just throw an error, the content should get replaced at runtime.
            throw AssertionError()
        }
}