package com.jnutz.purplepower.tools.wands;

import com.jnutz.purplepower.tools.toolCores.WandCore;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemWaterWand extends WandCore
{

	public ItemWaterWand()
	{

		super();

		this.setUnlocalizedName("waterWand");

	}

	@Override
	public ItemStack onItemRightClick(ItemStack WWandParts, World world, EntityPlayer player)
	{

		int xm = Minecraft.getMinecraft().objectMouseOver.blockX;
		int ym = Minecraft.getMinecraft().objectMouseOver.blockY;
		int zm = Minecraft.getMinecraft().objectMouseOver.blockZ;

		Block topBlock = world.getBlock(xm, ym + 1, zm);
		Block bottomBlock = world.getBlock(xm, ym - 1, zm);

		if(topBlock == Blocks.air && bottomBlock != Blocks.air)
		{
			world.setBlock(xm, ym + 1, zm, Blocks.water);
		}
		else if(topBlock == Blocks.water)
		{
			world.setBlock(xm, ym + 1, zm, Blocks.air);
		}

		return WWandParts;

	}

}
