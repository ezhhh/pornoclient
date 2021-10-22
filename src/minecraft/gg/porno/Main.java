package gg.porno;

import gg.porno.client.events.EventManager;
import gg.porno.client.events.EventTarget;
import gg.porno.client.events.events.EventKeyboard;
import gg.porno.features.Feature;
import gg.porno.features.FeatureManager;
import org.lwjgl.opengl.Display;

import java.util.stream.Collectors;

public class Main {

    //init
    public void onInit(){
        Display.setTitle("PornoClient");

        eventManager = new EventManager();
        eventManager.register(this);

        featureManager.init();
    }

    //closing
    public void onClose(){
        eventManager.unregister(this);
    }

    @EventTarget
    public void onInput(EventKeyboard event){
        featureManager.features.stream().filter(f -> f.keyBind == event.key).collect(Collectors.toList()).forEach(Feature::toggle);
    }

    public static FeatureManager featureManager = new FeatureManager();
    public static Main getter = new Main();

    public EventManager eventManager;
}
