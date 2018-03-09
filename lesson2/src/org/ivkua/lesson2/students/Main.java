package org.ivkua.lesson2.students;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        final StudentList sl = new StudentList();
        sl.add(new Student("Vova", "Ivanov", LocalDate.of(1993, Month.MARCH, 5)));
        sl.add(new Student("Vasya", "Pupkin",LocalDate.of(1994, Month.AUGUST, 14)));
        sl.add(new Student("Katia", "Runina", LocalDate.of(1993, Month.DECEMBER, 24)));
        sl.add(new Student("Vova", "Lopin", LocalDate.of(1992, Month.FEBRUARY, 28)));
        sl.delete(2);

        StudentList searchVova = sl.findName("Vova");

        System.out.println(sl);
        System.out.println();
        System.out.println(searchVova);

    }
}
