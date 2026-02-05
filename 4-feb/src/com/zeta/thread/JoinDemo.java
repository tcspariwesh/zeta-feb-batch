package com.zeta.thread;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Worker("worker-1");
		t.start();
		synchronized ("lock") {
			try {
				t.wait(99);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main done");
	}

}
