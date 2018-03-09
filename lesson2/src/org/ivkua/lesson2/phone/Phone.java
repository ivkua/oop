package org.ivkua.lesson2.phone;

public abstract class Phone {
    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected static int counterSms = 0;
    protected static int counterCalls = 0;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getCounterSms() {
        return counterSms;
    }

    public int getCounterCalls() {
        return counterCalls;
    }

    public void call(String number) {
        System.out.println("Phone class is calling " + number);
        counterCalls++;
    }

    public abstract void sendSMS(String number, String message);

}
