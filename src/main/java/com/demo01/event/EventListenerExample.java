package com.demo01.event;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerExample {

    @EventListener
    public void handleApplicationReady(ApplicationReadyEvent applicationReadyEvent) {
        System.out.println("起動完了後、該当メソッドを呼び出される");
    }
}
