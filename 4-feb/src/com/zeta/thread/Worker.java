package com.zeta.thread;

public class Worker extends Thread{
	public Worker(String string) {
		super(string);
	}

	@Override
	public void run() {
		for(int i=1;i<999; ++i) {
			System.out.println(getState());
				System.out.println("thread="+Thread.currentThread());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				throw new RuntimeException();
		
		}
		System.out.println("finished");
	}
}
