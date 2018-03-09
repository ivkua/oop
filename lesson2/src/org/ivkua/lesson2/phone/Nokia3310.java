package org.ivkua.lesson2.phone;

public class Nokia3310 extends Phone {
    public Nokia3310() {
        System.out.println("Nokia3310 constructor");
        touch = false;
        hasWifi = false;
        screenSize = 2;
    }

    protected void processCall(String number) {
        System.out.println("Nokia3310 class is calling " + number);
    }

    protected void processSms(String number, String message) {
        System.out.println("Nokia3310 class is sending sms " + message + " to " + number);
    }
}
