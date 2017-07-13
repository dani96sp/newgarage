package manager;

import java.util.ArrayList;
import java.util.List;

import domain.Bicycle;

public class BicycleManager {
	List<Bicycle> elements = new ArrayList<>();

	public List<Bicycle> list() {
		return elements;
	}

	public Bicycle save(final Bicycle newBicycle) {
		elements.add(newBicycle);
		return newBicycle;
	}

	public void delete(final Bicycle newBike) {
		elements.remove(newBike);
	}

	public Bicycle get(final int i) {
		elements.get(i);
		return elements.get(i);
	}
}
