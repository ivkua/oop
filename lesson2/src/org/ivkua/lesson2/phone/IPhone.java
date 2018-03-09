package org.ivkua.lesson2.phone;

public class IPhone extends Phone {
    protected String imei;
    public IPhone() {
        System.out.println("IPhone constructor");
        touch = true;
        hasWifi = true;
        screenSize = 3;
    }

    protected void processCall(String number) {
        System.out.println("IPhone class is calling " + number);
    }

    protected void processSms(String number, String message) {
        System.out.println("IPhone class is sending sms " + message + " to " + number);
    }
}
