package Xoch.RedTechAddon.items;

import java.util.List;
import java.util.logging.Level;

import org.lwjgl.input.Keyboard;

import ProofTheEngineer.RedTech.common.RedTech;
import Xoch.RedTechAddon.common.XPower;
import Xoch.RedTechAddon.other.XLogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumGameType;
import net.minecraft.world.World;

public class Gamemode extends Item{
	
	public static boolean active;
	
	public Gamemode(int id) {
		super(id);
		this.setMaxStackSize(1);
		active = false;
		this.setCreativeTab(RedTech.tabCustom);
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		
		if(!world.isRemote) {
			
			if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
			if(active == false) {
				active = true;
				player.setGameType(EnumGameType.CREATIVE);
			}else{
				active = false;
				player.setGameType(EnumGameType.SURVIVAL);
			}
			}else if(Keyboard.isKeyDown(Keyboard.KEY_G)) {
				player.setHealth(player.getHealth() + 20);
			}
			
		}
		
		return stack;
		
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack) {
        return true;
    }
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("Shift-RightClick To Change Gamemode!");
		par3List.add("THIS IS CREATIVE ONLY ITEM");
	}
	public void registerIcons(IconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(XPower.getTexture("CG"));
}

}