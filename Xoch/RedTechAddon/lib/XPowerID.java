package Xoch.RedTechAddon.lib;

public class XPowerID {
	
	public static int UMeter = 4000;
	public static int GooglesOfTech = getID(UMeter);
	public static int Gamemode = getID(GooglesOfTech);
	
	public static int ElectroIsolatedGlass = 4000;
	
	private static int getID(int ID) {
		return ID + 1;
	}
}
