package Xoch.RedTechAddon.lib;

import Xoch.RedTechAddon.items.XItems;
import net.minecraft.item.Item;

public class XPowerStrings {
	
	public static String NameEMeter = "Electricity Detector";
	
	public static String GetName(int itemID) {
		switch(itemID) {
		
		case 3000:
			return NameEMeter;
		case 2:
			
		}
		return null;
	}
}
