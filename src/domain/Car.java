package domain;

public class Car {
	private String plate;
	private String color;
	private String model;
	int numWheels;

	public Car(String plate, String color, String model) {
		this.plate = plate;
		this.color = color;
		this.model = model;
		this.numWheels = 4;
	}
	
}
