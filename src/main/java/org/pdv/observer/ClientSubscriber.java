package org.pdv.observer;

import java.time.LocalDateTime;

public class ClientSubscriber implements Subscriber {

    private String name;

    public ClientSubscriber(String nome) {
        this.name = nome;
    }

    @Override
    public void update(String message) {
        sleep();
        System.out.printf("\n\n Olá %s, \nPROMOÇÃO IMPERDIVEL!!! \n %s", this.name, message);
    }

    private static void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
