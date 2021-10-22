package gg.porno.client.events;

import gg.porno.Main;

import java.lang.reflect.InvocationTargetException;

public abstract class Event {

    private boolean cancelled;

    private static void call(final Event event) {

        final ArrayHelper<Data> dataList = Main.getter.eventManager.get(event.getClass());

        if (dataList != null) {
            for (final Data data : dataList) {

                try {
                    data.target.invoke(data.source, event);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public Event call() {

        this.cancelled = false;
        call(this);
        return this;
    }

    public boolean isCancelled() {

        return cancelled;
    }

    public void setCancelled(boolean cancelled) {

        this.cancelled = cancelled;
    }
}