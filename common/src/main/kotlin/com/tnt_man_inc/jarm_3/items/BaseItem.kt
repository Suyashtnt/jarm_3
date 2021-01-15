package com.tnt_man_inc.jarm_3.items;

import com.tnt_man_inc.jarm_3.Jarm;
import net.minecraft.world.item.Item;

public class BaseItem extends Item {
    public BaseItem(Properties properties) {
        // because im too lazy to do it per item
        super(properties.tab(Jarm.JARM_TAB));
    }
}
