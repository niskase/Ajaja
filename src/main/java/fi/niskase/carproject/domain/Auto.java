package fi.niskase.carproject.domain;

public class Auto {
	String mark;
	String model;
	Double topSpeed;
	Moottori moottori;
	Ajaja ajaja;

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Double topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Moottori getMoottori() {
		return moottori;
	}

	public void setMoottori(Moottori moottori) {
		this.moottori = moottori;
	}

	public Ajaja getAjaja() {
		return ajaja;
	}

	public void setAjaja(Ajaja ajaja) {
		this.ajaja = ajaja;
	}

	public Auto(String mark, String model, Double topSpeed, Moottori moottori,
			Ajaja ajaja) {
		super();
		this.mark = mark;
		this.model = model;
		this.topSpeed = topSpeed;
		this.moottori = moottori;
		this.ajaja = ajaja;
	}

	@Override
	public String toString() {
		return "Auto [mark=" + mark + ", model=" + model + ", topSpeed="
				+ topSpeed + ", moottori=" + moottori + ", ajaja=" + ajaja
				+ "]";
	}

	public double laskeNopeus() {
		double paluuArvo;

		paluuArvo = (moottori.getCylinders() - moottori.getBrokenCylinders()
				* topSpeed / moottori.getCylinders());

		return paluuArvo;
	}

}
