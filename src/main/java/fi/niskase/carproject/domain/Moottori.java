package fi.niskase.carproject.domain;

public class Moottori {
	int power;
	int cylinders;
	int brokenCylinders;
	
	public int setCylinders(int cylinders) {
		this.cylinders = cylinders;
		return cylinders;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getBrokenCylinders() {
		return brokenCylinders;
	}

	public void setBrokenCylinders(int brokenCylinders) {
		this.brokenCylinders = brokenCylinders;
	}

	public Moottori(int power, int cylinders, int brokenCylinders) {
		super();
		this.power = power;
		this.cylinders = cylinders;
		this.brokenCylinders = brokenCylinders;
	}
}
