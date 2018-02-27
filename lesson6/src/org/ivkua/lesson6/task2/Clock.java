package org.ivkua.lesson6.task2;

import java.util.Calendar;

public class Clock extends Thread {
    private final int timeDelay;

    public Clock(int timeDelay) {
        this.timeDelay = timeDelay;
    }

    public void run() {
        while (!isInterrupted()) {
            Calendar rightNow = Calendar.getInstance();
            System.out.println(rightNow.getTime());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Clock wes interrupted");
                break;
            }
        }
    }
}
