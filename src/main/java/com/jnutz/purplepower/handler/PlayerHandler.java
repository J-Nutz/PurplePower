package com.jnutz.purplepower.handler;

import com.jnutz.purplepower.init.items.ToolInits;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent;

public class PlayerHandler
{

	@SubscribeEvent
	public void onLivingUpdateEvent(LivingEvent.LivingUpdateEvent event)
	{
		// This event has an Entity variable, access it like this:
		//event.entity;

		// do something to player every update tick:
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entity;
			ItemStack heldItem = player.getHeldItem();
			if (heldItem != null && heldItem.getItem() == ToolInits.flightWand)
			{
				player.capabilities.allowFlying = true;
			}
			else
			{
				player.capabilities.allowFlying = player.capabilities.isCreativeMode ? true : false;
			}
		}
	}

}
