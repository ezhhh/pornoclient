package gg.porno.features.movement;

import gg.porno.client.events.EventTarget;
import gg.porno.client.events.events.EventMotion;
import gg.porno.features.Category;
import gg.porno.features.Feature;

public class Sprint extends Feature {

    public Sprint(){
        super("Sprint", "You will sprinting anytime", Category.MOVEMENT);
    }

    @EventTarget
    public void onMotion(EventMotion event){
        mc.player.setSprinting(true);
    }

}
