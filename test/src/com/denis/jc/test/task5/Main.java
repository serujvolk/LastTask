package com.denis.jc.test.task5;

public class Main {

	public static void main(String[] args) {
		Greeting gret = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Сколько времени? Правильно, доброй ночи мир");
			}
		};

		gret.sayHello();
	}

}
