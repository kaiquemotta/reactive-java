package org.pdv.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<Subscriber> subscribers;

    public Publisher() {
        this.subscribers = new ArrayList<>();
    }

    public void setSubscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void notifySubscribers(final String message) {

        for (Subscriber subscriber : subscribers) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    subscriber.update(message);
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
