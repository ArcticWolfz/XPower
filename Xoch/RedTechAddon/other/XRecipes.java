package Xoch.RedTechAddon.other;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import ProofTheEngineer.RedTech.block.Blocks;
import ProofTheEngineer.RedTech.common.RedTech;
import ProofTheEngineer.RedTech.items.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class XRecipes {

	public static void init() {
		
		//********************************************************************************************************\\
			
		GameRegistry.addShapedRecipe(new ItemStack(Items.DiamondDrill, 1), new Object[] {
					
			" xx", " cx", "v  ", 'v', Items.ControlSystem, 'x', Item.diamond, 'c', Items.Drill
		});
		
		
	}
	
}
