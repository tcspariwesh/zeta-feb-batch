package com.zeta.thread.race;

class Counter {
	int count = 0;

//	synchronized void increment() {
//		System.out.println("inside=" + count);
//		for (;;)
//			count++;
//	}

	// option2
	void increment() {
		System.out.println("inside=" + count);
		synchronized (this) {//critical section
			count++;
			for (;;);
		}
			
	}

	synchronized int getValue() {
		return count;
	}
}

class Worker1 extends Thread {

	private Counter counter;

	public Worker1(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.increment();
	}
}
