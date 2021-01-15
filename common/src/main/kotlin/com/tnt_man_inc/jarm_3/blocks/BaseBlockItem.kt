package com.tnt_man_inc.jarm_3.blocks

import com.tnt_man_inc.jarm_3.Jarm
import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.world.item.BlockItem
import net.minecraft.world.level.block.Block
import java.lang.AssertionError

class BaseBlockItem(block: Block?, properties: Properties) : BlockItem(block, properties.tab(Jarm.JARM_TAB))