package com.zeta.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
class Worker2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
	}
	
}
class MyThreadFactory implements ThreadFactory{

	@Override
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		thread.setName("zeta-worker");
		return thread ;
	}
	
}
public class ExecutorServiceDemo {
	public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool(new MyThreadFactory()); //
        for (int i = 0; i < 20; i++) {
        	executor.submit(new Worker2());
		}
       
        executor.shutdown();

	}
}
