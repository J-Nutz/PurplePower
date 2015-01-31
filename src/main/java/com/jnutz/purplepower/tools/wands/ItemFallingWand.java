package com.jnutz.purplepower.tools.wands;

import com.jnutz.purplepower.tools.toolCores.WandCore;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFallingWand extends WandCore
{

	public ItemFallingWand()
	{

		super();

		this.setUnlocalizedName("fallingWand");

	}

	@Override
	public void onUpdate(ItemStack FWand, World world, Entity player, int value, boolean bvalue)
	{

		super.onUpdate(FWand, world, player, value, bvalue);

		player.fallDistance = 0;

	}

}
