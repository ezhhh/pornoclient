package gg.porno.client.events.events;

import gg.porno.client.events.Event;

public class EventRender2D extends Event {

    public float width;
    public float height;

    float partialTicks;

    public EventRender2D(float width, float height, float partialTicks) {
        this.width = width;
        this.height = height;
        this.partialTicks = partialTicks;
    }

}
