package com.jnutz.purplepower.tools.wands;

import com.jnutz.purplepower.init.items.ToolInits;
import com.jnutz.purplepower.tools.toolCores.WandCore;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ItemFlightWand extends WandCore
{

	//Create Functions For Enabling/Disabling Flying?

	public boolean allowFlight;

	public ItemFlightWand()
	{

		super();
		this.setUnlocalizedName("flightWand");

	}

	@Override
	public ItemStack onItemRightClick(ItemStack FlightWandParts, World world, EntityPlayer player)
	{

		if(!player.capabilities.isCreativeMode)
		{
			if (player.capabilities.allowFlying)
			{
				player.capabilities.allowFlying = false;
				allowFlight = false;
			}
			else
			{
				allowFlight = true;
			}
		}

		return FlightWandParts;

	}


	@Override
	public void onUpdate(ItemStack FlWand, World world, Entity entity, int value, boolean bvalue)
	{

		EntityPlayer player = (EntityPlayer) entity;

		if(allowFlight)
		{
			if(entity != null)
			{
				player.capabilities.allowFlying = true;
			}
		}

		if(!player.capabilities.isCreativeMode)
		{
			if (!allowFlight)
			{
				allowFlight = false;
				player.fallDistance = 0;
				player.capabilities.allowFlying = false;
				player.capabilities.isFlying = false;
			}
		}

		ItemStack heldItem = player.getHeldItem();
		allowFlight = !(heldItem == null || heldItem.getItem() != ToolInits.flightWand);

	}
}
