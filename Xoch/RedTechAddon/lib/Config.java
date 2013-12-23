package Xoch.RedTechAddon.lib;

import java.io.File;

import ProofTheEngineer.RedTech.block.Blocks;
import ProofTheEngineer.RedTech.items.Items;
import net.minecraftforge.common.ConfigCategory;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class Config {
	public static void ConfigSetup(File configFile) {
		Configuration config = new Configuration(configFile);

		config.load();
		
		//IDs.SheamaticsTable_Acctual = config.getBlock(Strings.NameSchematicsTabel, IDs.SheamaticsTabel).getInt();
		
		config.save();
		
		}

	
	

}
