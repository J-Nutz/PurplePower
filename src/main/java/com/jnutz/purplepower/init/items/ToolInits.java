package com.jnutz.purplepower.init.items;

import com.jnutz.purplepower.tools.wands.ItemNightWand;
import cpw.mods.fml.common.registry.GameRegistry;

public class ToolInits
{

    public static final ItemNightWand nightWand = new ItemNightWand();

    public static void preInit()
    {

        GameRegistry.registerItem(nightWand, "nightWand");

    }

}
