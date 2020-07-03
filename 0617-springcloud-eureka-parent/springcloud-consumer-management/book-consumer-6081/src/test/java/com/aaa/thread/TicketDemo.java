package com.aaa.thread;

import java.util.concurrent.TimeUnit;

/**
 * @Author zyb
 * @Date 2020/7/2
 * @Description
 **/
public class TicketDemo extends Thread {

    private static int index;

    private static final Integer MAX = 10;

    @Override
    public void run() {
        synchronized (TicketDemo.class) {
            while (index <= MAX) {
                System.out.println("预约到的号码-->" + (index++));
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketDemo ticketDemo1 = new TicketDemo();
        TicketDemo ticketDemo2 = new TicketDemo();
        TicketDemo ticketDemo3 = new TicketDemo();
        TicketDemo ticketDemo4 = new TicketDemo();
        ticketDemo1.start();
        ticketDemo2.start();
        ticketDemo3.start();
        ticketDemo4.start();
    }
}
