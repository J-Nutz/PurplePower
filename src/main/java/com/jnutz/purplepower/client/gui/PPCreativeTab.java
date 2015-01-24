package com.jnutz.purplepower.client.gui;

import com.jnutz.purplepower.init.items.ToolInits;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PPCreativeTab extends CreativeTabs
{

	public PPCreativeTab(){

		super("PurpleTab");

	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem(){

		return ToolInits.nightWand;

	}

}
