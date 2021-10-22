package gg.porno.client.events.events;

import gg.porno.client.events.Event;
import net.minecraft.network.Packet;

public class EventPacketReceive extends Event {

    Packet<?> packet;

    public EventPacketReceive(Packet<?> packet) {
        this.packet = packet;
    }

    public Packet<?> getPacket() {
        return packet;
    }

    public void setPacket(Packet<?> packet) {
        this.packet = packet;
    }
}