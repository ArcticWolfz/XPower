package Xoch.RedTechAddon.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ProofTheEngineer.RedTech.common.RedTech;
import Xoch.RedTechAddon.common.XPower;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GooglesOfTech extends TechArmor{

	public GooglesOfTech(int id) {
		super(id);
		this.setCreativeTab(RedTech.tabCustom);
	}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("Now You Can See Electricity!");
	}
	public void registerIcons(IconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(XPower.getTexture("GOTech"));
}
}
