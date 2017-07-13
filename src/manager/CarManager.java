package manager;

import java.util.*;
import domain.*;

public class CarManager {
	private List<Car> elements = new ArrayList<>();

	public List<Car> list() {
		return elements;
	}

	public Car save(final Car newCar) {
		elements.add(newCar);
		return newCar;
	}

	public void delete(final Car newCar) {
		elements.remove(newCar);
	}

	public Car get(final int i) {
		elements.get(i);
		return elements.get(i);
	}

}
