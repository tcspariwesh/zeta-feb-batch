package quiz;

class A {
	static void show() {
		System.out.println("A static");
	}

	void display() {
		System.out.println("A non-static");
	}
}

class B extends A {
	static void show() {
		System.out.println("B static");
	}

	void display() {
		System.out.println("B non-static");
	}
}

public class Test {
	public static void main(String[] args) {
		A obj = new B();
		obj.show();
		obj.display();
	}
}
