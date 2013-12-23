package Xoch.RedTechAddon.items;

import java.awt.Image;
import java.util.Collection;
import java.util.Iterator;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.texture.TextureObject;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Icon;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;

import org.lwjgl.opengl.GL11;

import Xoch.RedTechAddon.common.XPower;

//
// GuiBuffBar implements a simple status bar at the top of the screen which 
// shows the current buffs/debuffs applied to the character.
//
public class TechGooglesHUD extends Gui {
  private Minecraft mc;

  public static int PowerTransfering;
  
  public TechGooglesHUD(Minecraft mc) {
    super();
    
    // We need this to invoke the render engine.
    this.mc = mc;
  }
  
  //
  // This event is called by GuiIngameForge during each frame by
  // GuiIngameForge.pre() and GuiIngameForce.post().
  //
  @ForgeSubscribe(priority = EventPriority.NORMAL)
  public void onRenderExperienceBar(RenderGameOverlayEvent event)
  {
    // 
    // We draw after the ExperienceBar has drawn.  The event raised by GuiIngameForge.pre()
    // will return true from isCancelable.  If you call event.setCanceled(true) in
    // that case, the portion of rendering which this event represents will be canceled.
    // We want to draw *after* the experience bar is drawn, so we make sure isCancelable() returns
    // false and that the eventType represents the ExperienceBar event.
    if(event.isCancelable() || event.type != ElementType.EXPERIENCE)
    {      
      return;
    }

    // Starting position for the buff bar - 2 pixels from the top left corner.
    int xPos = 2;
    int yPos = 2;
    ResourceLocation texture = new ResourceLocation(XPower.getTexture("textures/gui/TOG.png"));
    
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(GL11.GL_LIGHTING);
      this.mc.renderEngine.getTexture(texture);
      if(UniversalMeter.active == true) {
      mc.fontRenderer.drawString(PowerTransfering + " Eu/Tick", 4, 4, 15752);
      
      }
      
  }
  
}