package com.codedifferently.interfaces;

public interface Ridable {
    public void ride();

    default void stopRide() {
        // some default functionality so the code base doesn't break
    }
}
