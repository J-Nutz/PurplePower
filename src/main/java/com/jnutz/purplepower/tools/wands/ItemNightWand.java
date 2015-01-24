package com.jnutz.purplepower.tools.wands;

import com.jnutz.purplepower.tools.toolCores.WandCore;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemNightWand extends WandCore {

    public ItemNightWand()
    {

        super();
        this.setUnlocalizedName("nightWand");

    }

    @Override
    public ItemStack onItemRightClick(ItemStack NWandParts, World world, EntityPlayer player) {

        if (!world.isRemote)
        {

            world.setWorldTime(13000);

        }

        return NWandParts;

    }

}
