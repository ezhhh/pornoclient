package gg.porno.features;

import gg.porno.features.movement.Sprint;
import gg.porno.features.visual.HUD;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FeatureManager {

    public FeatureManager(){}

    public void init(){
        //combat

        //movement
        features.add(new Sprint());

        //player

        //misc

        //visual
        features.add(new HUD());
    }

    public Feature getFeatureByName(final String name){
        return features.stream().filter(f -> f.name.equalsIgnoreCase(name)).collect(Collectors.toList()).get(0);
    }

    public ArrayList<Feature> features = new ArrayList<>();
}
