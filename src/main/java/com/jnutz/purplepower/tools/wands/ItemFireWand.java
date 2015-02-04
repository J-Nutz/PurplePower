package com.jnutz.purplepower.tools.wands;

import com.jnutz.purplepower.tools.toolCores.WandCore;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFireWand extends WandCore
{

	public ItemFireWand()
	{

		super();
		this.setUnlocalizedName("fireWand");

	}

	@Override
	public ItemStack onItemRightClick(ItemStack FWandParts, World world, EntityPlayer player)
	{

		int xm = Minecraft.getMinecraft().objectMouseOver.blockX;
		int ym = Minecraft.getMinecraft().objectMouseOver.blockY;
		int zm = Minecraft.getMinecraft().objectMouseOver.blockZ;

		world.setBlock(xm, ym + 1, zm, Blocks.fire);

		return FWandParts;

	}

}
