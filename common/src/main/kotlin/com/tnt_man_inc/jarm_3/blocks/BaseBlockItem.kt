package com.tnt_man_inc.jarm_3.blocks;


import com.tnt_man_inc.jarm_3.Jarm;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class BaseBlockItem extends BlockItem {
    public BaseBlockItem(Block block, Properties properties) {
        super(block, properties.tab(Jarm.JARM_TAB));
    }
}
