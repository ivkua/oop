package org.ivkua.lesson2.phone;

public class IPhone5 extends IPhone{
    public IPhone5() {
        System.out.println("IPhone5 constructor");
        screenSize = 4;
        imei = "1111111";
    }

    protected void processCall(String number) {
        System.out.println("IPhone5 class is calling " + number);
    }

    protected void processSms(String number, String message) {
        System.out.println("IPhone5 class is sending sms " + message + " to " + number);
    }
}
