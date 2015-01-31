package com.jnutz.purplepower;

import com.jnutz.purplepower.handler.ConfigurationHandler;
import com.jnutz.purplepower.init.blocks.BlockInits;
import com.jnutz.purplepower.init.items.ToolInits;
import com.jnutz.purplepower.local.Locals;
import com.jnutz.purplepower.proxy.IProxy;
import com.jnutz.purplepower.world.generation.ModGeneration;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Locals.MOD_ID, name = Locals.MOD_NAME, version = Locals.VERSION, guiFactory = Locals.GUI_FACTORY_CLASS)
public class PurplePower
{

	@SidedProxy(clientSide = Locals.CLIENT_PROXY_CLASS, serverSide = Locals.SERVER_PROXY_CLASS)
	public static IProxy proxy;


	@Mod.Instance(Locals.MOD_ID)
	public static PurplePower instance;


	// Register Blocks and items and such

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		// Initializes the config
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

		ToolInits.preInit();
		BlockInits.preInit();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{

		ModGeneration.init();

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
}
