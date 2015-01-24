package com.jnutz.purplepower.tools.wands;

import com.jnutz.purplepower.tools.toolCores.WandCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDayWand extends WandCore
{

	public ItemDayWand()
	{

		super();
		this.setUnlocalizedName("dayWand");

	}

	@Override
	public ItemStack onItemRightClick(ItemStack DWandParts, World world, EntityPlayer player)
	{

		if(!world.isRemote)
		{

			world.setWorldTime(1000);

		}

		return DWandParts;

	}

}
