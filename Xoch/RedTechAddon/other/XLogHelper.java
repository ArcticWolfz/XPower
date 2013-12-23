package Xoch.RedTechAddon.other;

import java.util.logging.Level;
import java.util.logging.Logger;

import Xoch.RedTechAddon.lib.XPBooleans;
import Xoch.RedTechAddon.lib.XPowerInfo;
import cpw.mods.fml.common.FMLLog;

public class XLogHelper {
	private static Logger logger = Logger.getLogger(XPowerInfo.ModName);

	public static void init() {
	logger.setParent(FMLLog.getLogger());
	}

	public static void log(boolean DebugMode,Level logLevel, String message) {
		if (XPBooleans.DebugMode == DebugMode){
			logger.log(logLevel, "[RedTech Addon] Initialized " + message + " Without Error(s)");
		}

	}
	
}
