package com.jnutz.purplepower.tools.wands;

import com.jnutz.purplepower.tools.toolCores.WandCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemEffectClearerWand extends WandCore
{

	public ItemEffectClearerWand()
	{

		super();
		this.setUnlocalizedName("effectClearerWand");

	}

	@Override
	public ItemStack onItemRightClick(ItemStack ECWandParts, World world, EntityPlayer player)
	{

		for(int i = 0; i <20; i++)
		{
			player.removePotionEffect(i);
		}

		return ECWandParts;

	}

}
