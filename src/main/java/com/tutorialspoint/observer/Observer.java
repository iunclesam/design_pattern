package com.tutorialspoint.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
