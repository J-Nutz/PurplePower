package com.jnutz.purplepower.tools.wands;

import com.jnutz.purplepower.tools.toolCores.WandCore;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ItemDiggingWand extends WandCore
{

	public ItemDiggingWand()
	{

		super();

		this.setUnlocalizedName("diggingWand");

	}

	@Override
	public ItemStack onItemRightClick(ItemStack DigWandParts, World world, EntityPlayer player)
	{

		double posX = player.posX;
		double posY = player.posY;
		double posZ = player.posZ;




		return DigWandParts;

	}

}
