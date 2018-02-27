package org.ivkua.lesson6.task1;

public class Counter extends Thread {
    private final int begin;
    private final int end;

    public Counter(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public void run() {
        int x = 0;
        int distance = end - begin;
        while (!isInterrupted()) {
            System.out.println("tick in thread: " + (x++ % distance + begin));
            yield();
        }
    }
}

