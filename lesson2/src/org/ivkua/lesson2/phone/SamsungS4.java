package org.ivkua.lesson2.phone;

public class SamsungS4 extends Phone {
    private boolean wifi = false;

    public SamsungS4() {
        System.out.println("SamsungS4 constructor");
        screenSize = 5;
        hasWifi = true;
        touch = true;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void turnOnWifi() {
        if (!wifi) {
            wifi = true;
            System.out.println("Wifi is on");
        }
    }

    public void turnOffWifi() {
            if (wifi) {
                wifi = false;
                System.out.println("Wifi is off");
            }
    }

    @Override
    public void call(String number) {
        System.out.println("SamsungS4 class is calling to " + number);
        counterCalls++;
    }

    @Override
    public void sendSMS(String number, String message) {
        String adding = "Hello! ";
        System.out.println("SamsungS4 class is sending sms " + adding + message + " to " + number);
        counterSms++;
    }
}
