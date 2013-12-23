package Xoch.RedTechAddon.common;

import java.util.logging.Level;

import ProofTheEngineer.RedTech.common.RedTech;
import ProofTheEngineer.RedTech.items.Items;
import ProofTheEngineer.RedTech.lib.Info;
import Xoch.RedTechAddon.Blocks.XB;
import Xoch.RedTechAddon.items.TechGooglesHUD;
import Xoch.RedTechAddon.items.XI;
import Xoch.RedTechAddon.lib.*;
import Xoch.RedTechAddon.other.*;
import Xoch.RedTechAddon.lib.XPowerInfo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;
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

@Mod(modid = XPowerInfo.ModID  , name = XPowerInfo.ModName, version = XPowerInfo.ModVer )
@NetworkMod(clientSideRequired = true, serverSideRequired=false)
	

public class XPower {
	
	public static boolean isRedTechInstalled;
	public static boolean isIC2;
	
	@Instance(XPowerInfo.ModID)
    public static XPower instance;
	
	@SidedProxy(clientSide="Xoch.RedTechAddon.common.ClientProxy", serverSide="Xoch.RedTechAddon.common.CommonProxy")
    public static CommonProxy proxy;
	//preInit
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		if (Loader.isModLoaded("RedTech")) {
			   isRedTechInstalled = true;
			}
		if(Loader.isModLoaded("IndustrialCraft2")) {
			isIC2 = true;
		}
		
		XI.ItemsReg();
		
			XLogHelper.log(true, Level.INFO, "ItemsRegistry");
			
		XB.BlocksReg();
		
			XLogHelper.log(true, Level.INFO, "BlocksRegistry");
	}

	//load
	@EventHandler
    public void load(FMLInitializationEvent event) {
		
		proxy.registerRenderers();
		
		XRecipes.init();
		
			XLogHelper.log(true ,Level.INFO, "Recipes");
			
	}
    //postInit
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    	
    	MinecraftForge.EVENT_BUS.register(new TechGooglesHUD(Minecraft.getMinecraft()));
    	
    }
		
		
    
		
		public XPower() {
			LanguageRegistry.instance().addStringLocalization("itemGroup.RedTech Addon XPower", "en_US", XPowerInfo.ModName);
			
		}

		public static String getTexture(String Texture) {
			return "redtechaddon:" + Texture;
		}
		
}
