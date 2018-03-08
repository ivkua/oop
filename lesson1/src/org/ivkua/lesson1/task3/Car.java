package org.ivkua.lesson1.task3;

public class Car {
    private int speed;
    private boolean isStartedUp = false;

    public void startUp() {
        if (!isStartedUp) {
            System.out.println("The engine is started up");
            isStartedUp = true;
        } else {
            System.out.println("The engine has already been started");
        }
    }

    public void shutDown() {
        if (isStartedUp) {
            isStartedUp = false;
            speed = 0;
            System.out.println("The engine is shut down");
        } else {
            System.out.println("The engine has already been stopped");
        }

    }

    public void keepSpeed(int speed) {
        if (isStartedUp) {
            if (speed > 0) {
                System.out.println("The car rides at a speed of " + speed);
                this.speed = speed;
            } else {
                System.out.println("The ar can't go with that speed");
            }
        } else {
            System.out.println("The engine isn't started");
        }
    }

    public void stop(){
        speed = 0;
        isStartedUp = false;
        System.out.println("The car is stopped");
    }

    public void getSpeed() {
        System.out.println("The speed is " + speed);
    }
}
