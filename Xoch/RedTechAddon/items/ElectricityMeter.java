package Xoch.RedTechAddon.items;

import java.util.List;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ElectricityMeter extends Item{
	
	public static boolean active;
	
	public ElectricityMeter(int id) {
		super(id);
		this.setMaxStackSize(1);
		active = false;
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		
		if(!world.isRemote) {
			if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
			if(active == false) {
				active = true;
			}else{
				active = false;
			}
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
		par3List.add("Now You Can See Electricity!");
		par3List.add(active ? "Activated" : "Disabled");
	}
	public void registerIcons(IconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon("UMeter");
}

}
