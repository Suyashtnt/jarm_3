package com.tnt_man_inc.jarm_3.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import com.tnt_man_inc.jarm_3.ExampleMod;
import com.tnt_man_inc.jarm_3.Registries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Registries.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Registries.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ExampleMod.init();
    }
}
