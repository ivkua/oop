/*  -- Написать класс наследник SamsungS4 с диагональю экрана 5 дюймов, поддержкой Wifi и методом отправки
SMS, который будет дописывать к сообщению слово “Hello”.
   -- Модифицировать класс Phone так, чтобы он считал количество звонков и сообщений отдельно для каждого объекта.*/

package org.ivkua.lesson2.phone;

public class Main {
    public static void main(String[] args) {
        SamsungS4 samsungS4 = new SamsungS4();
        samsungS4.call("0957489848");
        samsungS4.call("0444577484");
        samsungS4.call("0444577484");
        samsungS4.sendSMS("0674588475", "WIll we meet?");
        System.out.println("SamsungS4 made " + samsungS4.getCounterCalls() + " calls");
        System.out.println("SamsungS4 sent " + samsungS4.getCounterSms() + " sms");
        System.out.println();

        IPhone5 iPhone5 = new IPhone5();
        iPhone5.call("0957489848");
        iPhone5.call("0504898476");
        iPhone5.call("0504898476");
        iPhone5.call("0504898476");
        iPhone5.sendSMS("0674588475", "WIll we meet?");
        System.out.println("iPhone5 made " + iPhone5.getCounterCalls() + " calls");
        System.out.println("iPhone5 sent " + iPhone5.getCounterSms() + " sms");

    }
}
