package Xoch.RedTechAddon.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import Xoch.RedTechAddon.lib.XPowerID;
import Xoch.RedTechAddon.lib.XPowerStrings;
import net.minecraft.block.Block;

public class XB {
	
	public static Block ElectroIsolatedGlass;
	
	public static void BlocksReg() {
		
		ElectroIsolatedGlass = new ElectroIsolatedGlass(XPowerID.ElectroIsolatedGlass).setUnlocalizedName("EIG");
		
		
		
		NameReg();
	}
	public static void NameReg() {
		
		GameRegistry.registerBlock(ElectroIsolatedGlass, "ElectroIsolatedGlasss");
		
		LanguageRegistry.addName(ElectroIsolatedGlass, XPowerStrings.NameElectroIsolatedGlass);
	}
}
