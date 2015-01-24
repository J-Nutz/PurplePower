package com.jnutz.purplepower.tools.toolCores;

import com.jnutz.purplepower.client.gui.PPCTab;
import com.jnutz.purplepower.local.Locals;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WandCore extends Item
{

    public WandCore()
    {

        super();

        setCreativeTab(PPCTab.PurpleTab);
        setMaxStackSize(1);

    }

    @Override
    public String getUnlocalizedName(){

        return String.format("item.%s%s", Locals.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()) );

    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){

        return String.format("item.%s%s", Locals.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

    }

    public String getUnwrappedUnlocalizedName(String unlocalizedName){

        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);

    }

    //Setting Image
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister){

        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));

    }

}
