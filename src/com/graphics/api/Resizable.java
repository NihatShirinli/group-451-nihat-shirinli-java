package com.graphics.api;

public interface Resizable {
	void resize(double factor);

    default void resizeTwice() {
        resize(2.0);
        logResize("увеличен в 2 раза");
    }

    private void logResize(String message) {
        System.out.println("Лог: " + message + " " + System.currentTimeMillis());
    }
}
