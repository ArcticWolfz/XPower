package Xoch.RedTechAddon.other;

import java.util.List;

import Xoch.RedTechAddon.common.XPower;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabIcon extends Item {

	public CreativeTabIcon(int id) {
		super(id);
		
	}
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
    }
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(XPower.getTexture("UMeter"));
}
}
