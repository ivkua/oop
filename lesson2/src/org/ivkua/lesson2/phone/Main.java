/*  -- Написать класс наследник SamsungS4 с диагональю экрана 5 дюймов, поддержкой Wifi и методом отправки
SMS, который будет дописывать к сообщению слово “Hello”.
   -- Модифицировать класс Phone так, чтобы он считал количество звонков и сообщений отдельно для каждого объекта.*/

package org.ivkua.lesson2.phone;

public class Main {
    public static void main(String[] args) {
        SamsungS4 samsungS4 = new SamsungS4();
        samsungS4.call("0957489848");
        samsungS4.call("0444577484");
        samsungS4.sendSMS("0674588475", "WIll we meet?");
        System.out.println("There were: " + samsungS4.getCounterCalls() + " calls");
        System.out.println("There were: " + samsungS4.getCounterSms() + " sms");

    }
}
