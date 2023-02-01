package org.example.thread;

import java.util.LinkedList;

public class ThreadMain {
    public static void main(String[] args) {
        /**
         * Defining a Thread
         * 1) by extending Thread class
         * 2) by implementing Runnable interface
         */

        MyThread myThread = new MyThread();
        myThread.start();

    }
}
