package com.sa.test;

public class Dog extends Animal {
	
	public static void main(String[] args) {
		Animal a =new Animal();
		a.name="Browny";
		a.age=2;
		a.eat();
		System.out.println("Animal Name is: "+a.name+" Animal Age is: "+a.age);
	}

}
