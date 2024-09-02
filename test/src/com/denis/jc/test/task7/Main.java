package com.denis.jc.test.task7;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Shape() {

			@Override
			double area(double pr) {
				return Math.PI * Math.pow(pr, 2);
			}

		};

		System.out.println("S=" + circle.area(20));

	}

}
