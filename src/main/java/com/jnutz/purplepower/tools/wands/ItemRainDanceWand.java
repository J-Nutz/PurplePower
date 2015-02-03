package com.jnutz.purplepower.tools.wands;

import com.jnutz.purplepower.tools.toolCores.WandCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRainDanceWand extends WandCore
{

	public ItemRainDanceWand()
	{

		super();
		this.setUnlocalizedName("rainDanceWand");

	}

	@Override
	public ItemStack onItemRightClick(ItemStack RWandParts, World world, EntityPlayer player)
	{

		if(!world.isRemote)
		{
			if(world.isRaining())
			{
				world.getWorldInfo().setRaining(false);
			}
			else
			{
				world.getWorldInfo().setRaining(true);
			}
		}

		return RWandParts;

	}
}
