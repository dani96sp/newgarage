package manager;

import java.util.ArrayList;
import java.util.List;

import domain.MotorBike;

public class MotorBikeManager {
	List<MotorBike> elements = new ArrayList<>();

	public List<MotorBike> list() {
		return elements;
	}

	public MotorBike save(final MotorBike newMotorBike) {
		elements.add(newMotorBike);
		return newMotorBike;
	}

	public void delete(final MotorBike newMotorBike) {
		elements.remove(newMotorBike);
	}

	public MotorBike get(final int i) {
		elements.get(i);
		return elements.get(i);
	}
}
