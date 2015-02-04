package com.jnutz.purplepower.init.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ToolRecipes
{

	public static void preInit()
	{

		//Items
		ItemStack stick = new ItemStack(Items.stick);
		ItemStack emerald = new ItemStack(Items.emerald);
		ItemStack sunflower = new ItemStack(Blocks.double_plant);
		ItemStack glowStoneBlock = new ItemStack(Blocks.glowstone);
		ItemStack milk = new ItemStack(Items.milk_bucket);
		ItemStack blazeRod = new ItemStack(Items.blaze_rod);
		ItemStack feather = new ItemStack(Items.feather);
		ItemStack diamondBoots = new ItemStack(Items.diamond_boots);
		ItemStack netherStar = new ItemStack(Items.nether_star);
		ItemStack enderPearl = new ItemStack(Items.ender_pearl);
		ItemStack obsidian = new ItemStack(Blocks.obsidian);
		ItemStack inkSac = new ItemStack(Items.dye, 1, 0);
		ItemStack waterBucket = new ItemStack(Items.water_bucket);
		ItemStack cauldron = new ItemStack(Items.cauldron);
		ItemStack dispenser = new ItemStack(Blocks.dispenser);
		ItemStack blazePowder = new ItemStack(Items.blaze_powder);
		ItemStack flintAndSteel = new ItemStack(Items.flint_and_steel);

		//Registers
		GameRegistry.addRecipe(new ItemStack(ToolInits.dayWand), "lfl", " e ", " s ",
								'l', glowStoneBlock, 'f', sunflower, 'e', emerald, 's', stick);

		GameRegistry.addRecipe(new ItemStack(ToolInits.effectClearerWand), "mbm", " e ", " s ",
								'm', milk, 'b', blazeRod, 'e', emerald, 's', stick);

		GameRegistry.addRecipe(new ItemStack(ToolInits.fallingWand), "fbf", " e ", " s ",
								'f', feather, 'b', diamondBoots, 'e', emerald, 's', stick); //Feather Falling Enchant?

		GameRegistry.addRecipe(new ItemStack(ToolInits.fireWand), "bfb", " e ", " s ",
								'b', blazePowder, 'f', flintAndSteel, 'e', emerald, 's', stick);

		GameRegistry.addRecipe(new ItemStack(ToolInits.flightWand), "pnp", " e ", " s ",
								'p', enderPearl, 'n', netherStar, 'e', emerald, 's', stick);

		GameRegistry.addRecipe(new ItemStack(ToolInits.nightWand), "oio", " e ", " s ",
								'o', obsidian, 'i', inkSac, 'e', emerald, 's', stick);

		GameRegistry.addRecipe(new ItemStack(ToolInits.rainDanceWand), "cwc", " e ", " s ",
								'c', cauldron, 'w', waterBucket, 'e', emerald, 's', stick);

		GameRegistry.addRecipe(new ItemStack(ToolInits.waterWand), "wdw", " e ", " s ",
								'w', waterBucket, 'd', dispenser, 'e', emerald, 's', stick);

	}

}
