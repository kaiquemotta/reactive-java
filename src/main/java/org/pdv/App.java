package org.pdv;

import org.pdv.observer.ClientSubscriber;
import org.pdv.observer.LogSubscriber;
import org.pdv.observer.Publisher;
import org.pdv.shop.Shop;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> messages = Arrays.asList("Lava louças 8 serviços Samsung");
        Publisher publisher = new Publisher();
        ClientSubscriber cliente = new ClientSubscriber("Kaique Motta");
        ClientSubscriber client2 = new ClientSubscriber("Zé Sorocaba");

        LogSubscriber logSubscriber = new LogSubscriber();
        publisher.setSubscribe(logSubscriber);
        publisher.setSubscribe(cliente);
        publisher.setSubscribe(client2);

        Shop shop = new Shop(publisher);
        shop.sendPromotionMessages(messages);
    }
}
