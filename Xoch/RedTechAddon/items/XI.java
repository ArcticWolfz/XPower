package Xoch.RedTechAddon.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import Xoch.RedTechAddon.common.XPower;
import Xoch.RedTechAddon.lib.XPowerID;
import Xoch.RedTechAddon.lib.XPowerStrings;
import Xoch.RedTechAddon.other.CreativeTabIcon;
import net.minecraft.item.Item;

public class XI {
	
	public static Item UniversalMeter;
	public static Item CreativeTabIcon;
	public static Item GooglesOfTech;
	public static Item Gamemode;
	
	public static void ItemsReg() {
		
		CreativeTabIcon = new CreativeTabIcon(7000);
		UniversalMeter = new UniversalMeter(XPowerID.UMeter).setUnlocalizedName("UMeter");
		GooglesOfTech = new GooglesOfTech(XPowerID.GooglesOfTech).setUnlocalizedName("GOTech");
		Gamemode = new Gamemode(XPowerID.Gamemode).setUnlocalizedName("Gamemode");
		
		NameReg();
	}
	
	public static void NameReg() {
		LanguageRegistry.addName(UniversalMeter, XPowerStrings.NameEMeter);
		LanguageRegistry.addName(GooglesOfTech, XPowerStrings.NameGOT);
		LanguageRegistry.addName(CreativeTabIcon, "CREATIVETABICON");
		LanguageRegistry.addName(Gamemode, XPowerStrings.NameGamemode);
		
	}
	public static void ItemsRegistry(String Level, boolean par1) {
		if(Level.contains("If it is true")) {
		if(!par1) {
			
			
			
			NameRegistry();
		}
	}else{
		if(par1) {
			
			
			
		}
	}
	}
	public static void NameRegistry() {
		
		
		
	}
	
}
