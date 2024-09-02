package com.denis.jc.test.task2;

public class Car {

	String model = "Mercedes Benz E100";
	int age = 2001;

	Engine engine = new Engine();

	class Engine {

		String type = "diesel motor";
		int power = 260;

	}

	void displayCarInfo() {
		System.out.println("Модель " + model + ", год выпуска '" + age + "', двигатель '" + engine.type
				+ "', power (H.P) = " + engine.power + " h.p.");
	}

}
