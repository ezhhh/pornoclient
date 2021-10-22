package gg.porno.client.events.events;

import gg.porno.client.events.Event;

public class EventKeyboard extends Event {

    public int key;

    public EventKeyboard(int key){
        this.key = key;
    }

}
