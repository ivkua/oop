package org.ivkua.lesson2.phone;

public abstract class Phone {
    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    private int counterSms = 0;
    private int counterCalls = 0;

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

    public final void call(String number) {
        counterCalls++;
        processCall(number);
    }

    protected abstract void processCall(String number);

    public final void sendSMS(String number, String message){
        counterSms++;
        processSms(number, message);
    }

    protected abstract void processSms(String number, String message);

}
