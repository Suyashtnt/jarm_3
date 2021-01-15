package com.tnt_man_inc.jarm_3;

import com.tnt_man_inc.jarm_3.blocks.BlockInitializer;
import com.tnt_man_inc.jarm_3.items.ItemsInitializer;
import com.tnt_man_inc.jarm_3.items.Ruby;
import me.shedaniel.architectury.registry.CreativeTabs;
import me.shedaniel.architectury.registry.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

import static com.tnt_man_inc.jarm_3.Registries.*;

public class Jarm {
    // We can use this if we don't want to use DeferredRegister
    public static final LazyLoadedValue<Registries> REGISTRIES = new LazyLoadedValue<>(() -> Registries.get(MOD_ID));
    // Registering a new creative tab
    public static final CreativeModeTab JARM_TAB = CreativeTabs.create(new ResourceLocation(MOD_ID, "general"), new Supplier<ItemStack>() {
        @Override
        public ItemStack get() {
            return new ItemStack(Ruby.RUBY_ITEM.get());
        }
    });
    
    public static void init() {
        BlockInitializer.init();
        ItemsInitializer.init();
        // register blocks first so BlockItems dont :crab: and cause an error
        BLOCKS.register();
        ITEMS.register();
        
        System.out.println(ExampleExpectPlatform.getConfigDirectory().getAbsolutePath());
    }
}
