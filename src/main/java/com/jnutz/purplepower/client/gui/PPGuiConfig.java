package com.jnutz.purplepower.client.gui;

import com.jnutz.purplepower.handler.ConfigurationHandler;
import com.jnutz.purplepower.local.Locals;
import cpw.mods.fml.client.config.GuiConfig;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class PPGuiConfig extends GuiConfig
{

    public PPGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Locals.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }

}
