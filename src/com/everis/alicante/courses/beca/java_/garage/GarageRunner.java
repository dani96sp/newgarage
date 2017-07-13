package com.everis.alicante.courses.beca.java_.garage;

import java.util.Scanner;

import com.everis.alicante.courses.becajava.garage.ui.GarageMenu;

import domain.Bicycle;
import domain.Car;
import domain.MotorBike;
import manager.BicycleManager;
import manager.CarManager;
import manager.MotorBikeManager;

public class GarageRunner {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String option;
		CarManager carManager = new CarManager();
		MotorBikeManager motorBikeManager = new MotorBikeManager();
		BicycleManager bicycleManager = new BicycleManager();
		do {
			option = GarageMenu.getInstance().play();
			switch (option) {
			// car list
			case "1.1":
				System.out.println(carManager.list());
				break;
			// car new
			case "1.2":
				System.out.println(carManager.save(carBuilder()));
				break;
			// car delete
			case "1.3":
				// System.out.println(carManager.delete());
				break;

			case "2.1":
				System.out.println(carManager.list());
				break;

			case "2.2":
				System.out.println(motorBikeManager.save(motorBikeBuilder()));
				break;

			case "2.3":
				// System.out.println(carManager.delete());
				break;

			case "3.1":
				System.out.println(carManager.list());
				break;

			case "3.2":
				System.out.println(bicycleManager.save(bicycleBuilder()));
				break;

			case "3.3":
				// System.out.println(carManager.delete());
				break;

			}
		} while (!option.equals("0"));
	}

	private static Car carBuilder() {
		System.out.println("Introduzca matricula");
		String plate = sc.nextLine();
		System.out.println("Introduzca color");
		String color = sc.nextLine();
		System.out.println("Introduzca modelo");
		String model = sc.nextLine();

		return new Car(plate, color, model);
	}

	private static MotorBike motorBikeBuilder() {
		System.out.println("Introduzca matricula");
		String plate = sc.nextLine();
		System.out.println("Introduzca color");
		String color = sc.nextLine();
		System.out.println("Introduzca modelo");
		String model = sc.nextLine();

		return new MotorBike(plate, color, model);
	}

	private static Bicycle bicycleBuilder() {
		System.out.println("Introduzca matricula");
		String plate = sc.nextLine();
		System.out.println("Introduzca color");
		String color = sc.nextLine();
		System.out.println("Introduzca modelo");
		String model = sc.nextLine();

		return new Bicycle(color, model);
	}

}
