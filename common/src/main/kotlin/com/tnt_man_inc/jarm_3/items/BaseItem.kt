package com.tnt_man_inc.jarm_3.items

import com.tnt_man_inc.jarm_3.Jarm
import com.tnt_man_inc.jarm_3.items.NISGDApple
import net.minecraft.world.item.Item
import java.lang.AssertionError

open class BaseItem(properties: Properties) : Item(properties.tab(Jarm.JARM_TAB))