package com.jnutz.purplepower.init.items;

import com.jnutz.purplepower.tools.wands.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ToolInits
{

    public static final ItemNightWand nightWand = new ItemNightWand();
    public static final ItemDayWand dayWand = new ItemDayWand();
    public static final ItemFallingWand fallingWand = new ItemFallingWand();
    public static final ItemFlightWand flightWand = new ItemFlightWand();
    public static final ItemRainDanceWand rainDanceWand = new ItemRainDanceWand();

    public static void preInit()
    {

        GameRegistry.registerItem(nightWand, "nightWand");
        GameRegistry.registerItem(dayWand, "dayWand");
        GameRegistry.registerItem(fallingWand, "fallingWand");
        GameRegistry.registerItem(flightWand, "flightWand");
        GameRegistry.registerItem(rainDanceWand, "rainDanceWand");

    }

}
