package com.zeta.executor;
class T extends Thread {
    public void run() {
        while(true) {
            System.out.print("X ");
        }
    }
}

public class DaemonDemo {
    public static void main(String[] args) {
        T t = new T();
        t.setDaemon(true);
        t.start();
        System.out.println("Main done");
    }
}
