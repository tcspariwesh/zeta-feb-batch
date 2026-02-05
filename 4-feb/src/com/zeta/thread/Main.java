package com.zeta.thread;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Worker worker0 = new Worker("staff1");
		worker0.start();
		try {
			worker0.wait(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		Worker worker1 = new Worker("staff2");
		worker1.start();
		worker1.yield();
	}
}
