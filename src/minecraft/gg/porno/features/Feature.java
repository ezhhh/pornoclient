package gg.porno.features;

import gg.porno.Main;
import net.minecraft.client.Minecraft;

public class Feature {

    protected static Minecraft mc = Minecraft.getMinecraft();

    //feature meta
    public final String name,des;
    public final Category category;

    //feature status
    public boolean visible = false, enabled = false;

    public int keyBind;

    public Feature(String name, String des, Category category){
        this.name = name;
        this.des = des;
        this.category = category;
    }

    public void setEnabled(final boolean temp){
        this.enabled = temp;

        if(this.enabled) onEnable();
        else onDisable();
    }

    public void toggle(){
        this.enabled = !enabled;

        if(this.enabled) onEnable();
        else onDisable();
    }

    public void onEnable(){
        Main.getter.eventManager.register(this);
    }
    public void onDisable(){
        Main.getter.eventManager.unregister(this);
    }
}
