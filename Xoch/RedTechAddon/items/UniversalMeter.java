package Xoch.RedTechAddon.items;

import java.util.List;
import java.util.logging.Level;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import ProofTheEngineer.RedTech.common.RedTech;
import Xoch.RedTechAddon.Blocks.XB;
import Xoch.RedTechAddon.common.XPower;
import Xoch.RedTechAddon.other.XLogHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumGameType;
import net.minecraft.world.World;

public class UniversalMeter extends Item{
	
	public static boolean active;
	
	public UniversalMeter(int id) {
		super(id);
		this.setMaxStackSize(1);
		active = false;
		this.setCreativeTab(RedTech.tabCustom);
	}
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {

		if (!world.isRemote) {
			
			if (Keyboard.isKeyDown(Keyboard.KEY_RSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
				if (active == false) {
					active = true;

				} else {
					active = false;

				}
				if(Keyboard.isKeyDown(Keyboard.KEY_G)) {
					TechGooglesHUD.PowerTransfering = 0;
				}
			}

		}

		return stack;

	}
	
	@Override
    public boolean onBlockDestroyed(ItemStack stack, World world, int blockID, int x, int y, int z, EntityLivingBase entityLivingBase) {
        if (!world.isRemote) {
        	if(blockID == XB.ElectroIsolatedGlass.blockID) {
        		TechGooglesHUD.PowerTransfering++;
        		world.setBlock(x, y, z, XB.ElectroIsolatedGlass.blockID);
        	}
        }
        return true;
    }
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack) {
        return active ? true : false;
    }
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("Shift-RightClick To Activate!");
		par3List.add(active ? "Activated" : "Disabled");
	}
	public void registerIcons(IconRegister iconRegister){
		
		itemIcon = iconRegister.registerIcon(XPower.getTexture("UMeter"));
}

}
