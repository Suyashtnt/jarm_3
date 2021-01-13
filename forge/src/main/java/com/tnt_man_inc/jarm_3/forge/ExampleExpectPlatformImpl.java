package com.tnt_man_inc.jarm_3.forge;

import com.tnt_man_inc.jarm_3.ExampleExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;

public class ExampleExpectPlatformImpl {
    /**
     * This is our actual method to {@link ExampleExpectPlatform#getConfigDirectory()}.
     */
    public static File getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get().toFile();
    }
}
