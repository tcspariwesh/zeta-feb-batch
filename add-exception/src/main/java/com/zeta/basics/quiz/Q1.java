package com.zeta.basics.quiz;

public class Q1 {
	public static void main(String[] args) {
		Dog a= new Dog();
		a.eat();
	}
}
class Animal {
    private void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog eating");
    }
}
