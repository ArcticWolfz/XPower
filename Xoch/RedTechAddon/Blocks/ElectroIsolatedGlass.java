package Xoch.RedTechAddon.Blocks;

import ProofTheEngineer.RedTech.common.RedTech;
import Xoch.RedTechAddon.common.XPower;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class ElectroIsolatedGlass extends BlockGlass {

	public ElectroIsolatedGlass(int id) {
		super(id, Material.rock, true);
		this.setCreativeTab(RedTech.tabCustom);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon =  iconRegister.registerIcon(XPower.getTexture("ElectroIsolatedGlass"));
	}

}
