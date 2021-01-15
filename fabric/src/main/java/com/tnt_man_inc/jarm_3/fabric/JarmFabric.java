package com.tnt_man_inc.jarm_3.fabric;

import com.tnt_man_inc.jarm_3.Jarm;
import net.fabricmc.api.ModInitializer;

public class JarmFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Jarm.init();
    }
}
