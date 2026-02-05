package com.zeta.quiz;

public class Test {
	public static void main(String[] args) throws Exception {
		A a = new A();
		B b = new B();
		Thread t1= new Thread(()-> a.m1(b));
		Thread t2 = new Thread(()-> b.m1(a));
		t1.start();t2.start();
	}
}

class A {
	synchronized void m1(B b) {
		System.out.println("in a.m1");
		b.last();
	}

	synchronized void last() {
		System.out.println("a.last");
	}
}

class B {
	synchronized void m1(A a) {
		System.out.println("in b.m1");
		a.last();
	}

	synchronized void last() {
		System.out.println("b.last");
	}
}
