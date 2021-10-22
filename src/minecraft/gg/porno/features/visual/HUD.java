package gg.porno.features.visual;

import gg.porno.Main;
import gg.porno.client.events.EventTarget;
import gg.porno.client.events.events.EventRender2D;
import gg.porno.features.Category;
import gg.porno.features.Feature;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.text.TextFormatting;

public class HUD extends Feature {

    public HUD(){
        super("HUD", "Displays information on the screen", Category.VISUAL);
        setEnabled(true);
    }

    @EventTarget
    public void onRender(EventRender2D event){
        fr.drawStringWithShadow(TextFormatting.YELLOW + "Porno" + TextFormatting.BLACK + "Client", 3,3, -1);

        float index = 0;

        for(Feature feature : Main.featureManager.features){
            if(!feature.enabled) continue;

            fr.drawStringWithShadow(feature.name, event.width - fr.getStringWidth(feature.name) - 1, 1 + index, -1);
            ++index;
        }
    }

    FontRenderer fr = mc.fontRendererObj;

}
