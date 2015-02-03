package com.jnutz.purplepower.tools.wands;

import com.jnutz.purplepower.tools.toolCores.WandCore;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFallingWand extends WandCore
{

	public ItemFallingWand()
	{

		super();
		this.setUnlocalizedName("fallingWand");

	}

	//Add Little onRightClick function for fun?

	@Override
	public void onUpdate(ItemStack FWand, World world, Entity player, int value, boolean bvalue)
	{
		player.fallDistance = 0;
	}

	//Keep? Improve?
	@Override
	public ItemStack onItemRightClick(ItemStack FallingWandParts, World world, EntityPlayer player)
	{

		double x = player.posX;
		double y = player.posY;
		double z = player.posZ;

		player.setPosition(x, y + 1, z);

		return FallingWandParts;

	}
}
