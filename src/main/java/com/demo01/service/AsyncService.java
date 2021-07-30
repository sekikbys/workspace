package com.demo01.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class AsyncService {

    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Async
    public void sendMsg(String message) {
        try {
            System.out.println("■Start sendingMsg at " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
            // ５秒程寝かせる
            Thread.sleep(5000);
            System.out.println(" Msg : " + message);
            System.out.println("■Msg Sended at " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
