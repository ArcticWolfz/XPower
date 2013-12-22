package Xoch.RedTechAddon.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import Xoch.RedTechAddon.lib.XPowerID;
import Xoch.RedTechAddon.lib.XPowerStrings;
import net.minecraft.item.Item;

public class XItems {
	
	public static Item UniversalMeter;
	
	public static void ItemsReg() {
		
		UniversalMeter = new ElectricityMeter(XPowerID.UMeter).setUnlocalizedName("UMeter");
		
		
		
		LanguageRegistry.addName(UniversalMeter, XPowerStrings.GetName(UniversalMeter.itemID));
	}
	
}
