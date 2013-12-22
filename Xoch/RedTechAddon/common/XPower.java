package Xoch.RedTechAddon.common;

import java.util.logging.Level;

import Xoch.RedTechAddon.lib.*;
import Xoch.RedTechAddon.other.*;
import Xoch.RedTechAddon.items.XItems;
import Xoch.RedTechAddon.lib.XPowerInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = XPowerInfo.ModID  , name = XPowerInfo.ModName, version = XPowerInfo.ModVer, dependencies = "Red Tech" )
@NetworkMod(clientSideRequired = true, serverSideRequired=false)
	

public class XPower {
	
	public static boolean isRedTechInstalled;
	
	@Instance(XPowerInfo.ModID)
    public static XPower instance;
	
	@SidedProxy(clientSide="Xoch.RedTechAddon.common.ClientProxy", serverSide="Xoch.RedTechAddon.common.CommonProxy")
    public static CommonProxy proxy;
	//preInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		XItems.ItemsReg();
		
			XLogHelper.log(true ,Level.INFO, "[RedTech Addon] Initialized ItemsReg Without Error(s)");
			
	}

	//load
	@EventHandler
    public void load(FMLInitializationEvent event) {
		
		proxy.registerRenderers();
		
		XRecipes.init();
		
			XLogHelper.log(true ,Level.INFO, "Initialized Recipes Without Errors");
			
	}
    //postInit
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
     
    
    }
		
		
    
		
		public XPower() {
			LanguageRegistry.instance().addStringLocalization("itemGroup.RedTech", "en_US", XPowerInfo.ModName);
			
		}
		
}
