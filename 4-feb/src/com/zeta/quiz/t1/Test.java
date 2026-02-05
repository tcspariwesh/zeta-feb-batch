package com.zeta.quiz.t1;
class T extends Thread {
    public void run() {
        System.out.print("X ");
    }
}

public class Test {
    public static void main(String[] args) {
        T t = new T();
        t.start();
        t.start();
    }
}
