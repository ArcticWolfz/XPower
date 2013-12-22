package Xoch.RedTechAddon.other;

import java.util.logging.Level;
import java.util.logging.Logger;

import ProofTheEngineer.RedTech.lib.Booleans;
import ProofTheEngineer.RedTech.lib.Info;
import cpw.mods.fml.common.FMLLog;

public class XLogHelper {
	private static Logger logger = Logger.getLogger(Info.ModName);

	public static void init() {
	logger.setParent(FMLLog.getLogger());
	}

	public static void log(boolean DebugMode,Level logLevel, String message) {
		if (Booleans.DebugMode == DebugMode){
			logger.log(logLevel, message);
		}

	}
	
}
