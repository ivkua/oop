package org.ivkua.lesson2.Students;

import java.time.LocalDate;

public class StudentList {
    private Student[] list = new Student[100];
    private int size = 0;
    private int totalSize = 100;

    public void add(Student s) {
        if(size == totalSize){
            totalSize += 100;
            Student[] newList = new Student[totalSize];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
        list[size++] = s;
    }

    public Student get(int n) {
        return list[n];
    }

    public StudentList findName(String name) {
        StudentList studentList = new StudentList();
        for (int i = 0; i < size; i++) {
            if (list[i].getName().equalsIgnoreCase(name)) {
                studentList.add(list[i]);
            }
        }
        return studentList;
    }

    public StudentList findSurname(String surname){
        StudentList studentList = new StudentList();
        for (int i = 0; i < size; i++) {
            if (list[i].getSurname().equalsIgnoreCase(surname)){
                studentList.add(list[i]);
            }
        }
        return studentList;
    }

    public StudentList findDate(LocalDate birth){
        StudentList studentList = new StudentList();
        for (int i = 0; i < size; i++) {
            if (list[i].getBirth().equals(birth)){
                studentList.add(list[i]);
            }
        }
        return studentList;
    }

    public void delete(int index){
        System.arraycopy(list, index + 1, list, index, list.length - index - 1);
        list[list.length - 1] = null;
        size--;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(list[i].toString());
            if (i + 1 != size){
                sb.append(", \r\n");
            }
        }
        return sb.toString();
    }
}
