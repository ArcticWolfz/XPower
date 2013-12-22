package Xoch.RedTechAddon.common;

import java.util.logging.Level;

import ProofTheEngineer.RedTech.other.LogHelper;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void registerRenderers() {
            // This is for rendering entities and so forth later on
		LogHelper.log(true, Level.INFO, "Done With Rendering");
	}
	
}
