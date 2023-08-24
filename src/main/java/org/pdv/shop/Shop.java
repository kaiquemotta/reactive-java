package org.pdv.shop;

import org.pdv.observer.Publisher;

import java.util.List;

public class Shop {
    private Publisher publisher;

    public Shop(Publisher publisher) {
        this.publisher = publisher;
    }

    public void sendPromotionMessages(List<String> messages){
        messages.forEach(message -> publisher.notifySubscribers(message));
    }
}
