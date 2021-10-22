package gg.porno.client.events.events;

import gg.porno.client.events.Event;

public class EventRender3D extends Event {
    final float partialTicks;

    public EventRender3D(float partialTicks) {
        this.partialTicks = partialTicks;
    }

    public float getPartialTicks() {
        return this.partialTicks;
    }
}