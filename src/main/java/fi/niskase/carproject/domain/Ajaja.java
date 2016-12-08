package fi.niskase.carproject.domain;

public class Ajaja {
	Auto ajettava;
	String nimi;
	Ajotapa ajotapa;
	
	public Ajaja(Auto ajettava, String nimi, Ajotapa ajotapa) {
		super();
		this.ajettava = ajettava;
		this.nimi = nimi;
		this.ajotapa = ajotapa;
	}

	public Auto getAjettava() {
		return ajettava;
	}

	public void setAjettava(Auto ajettava) {
		this.ajettava = ajettava;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public Ajotapa getAjotapa() {
		return ajotapa;
	}

	public void setAjotapa(Ajotapa ajotapa) {
		this.ajotapa = ajotapa;
	}

	@Override
	public String toString() {
		return "Ajaja [ajettava=" + ajettava + ", nimi=" + nimi + "]";
	}
	
	public enum Ajotapa {
		AGGRESSIIVINEN(1.0), TAVALLINEN(0.7), RAUHALLINEN(0.4);
		
		private final double kerroin;
		
		Ajotapa(double kerroin) {
			this.kerroin = kerroin;
		}
	}
	
	public double aja(double tuntia) {
		double paluuArvo;
		
		if (tuntia < 0.0) {
			return 0.0;
		}
		paluuArvo = ajettava.laskeNopeus() * tuntia * ajotapa.kerroin;
		
		return paluuArvo;
	}

}