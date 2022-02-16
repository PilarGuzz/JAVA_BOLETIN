package ejercicios;

public class Avion {

	//Atributos
	private String idAvion;
	private final Integer capacidad;
	private Integer numVuelos = 0;
	private Double kmVolados = 0.0;
	private String compannia;
	
	
	//constructores
	public Avion(String id, Integer capacidad ) {
		this.idAvion=id;
		this.capacidad = capacidad;
	}
	
	public Avion (String id, String compania, Integer capacidad) {
		this.idAvion=id;
		this.capacidad = capacidad;
		this.compannia = compania;
	}
	
	
	//metodos
	public boolean asignarVuelo(int viajeros, double km) {
		boolean posibleAsignarVuelos = false;
		
		if (viajeros <= this.capacidad) {
			this.kmVolados += km;
			this.numVuelos++;
			posibleAsignarVuelos= true;
		}
		return posibleAsignarVuelos;
	}
	
	

	public double getTotalKm() {
		return 0.0;
	}
	
	public double getMediaKm() {
		double resultado = 0;
		
		if (numVuelos>0) {
			resultado = kmVolados/numVuelos;
		}
		return resultado;
	}
	
	
	
	//getter and setter
	public String getIdAvion() {
		return idAvion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public Integer getNumVuelos() {
		return numVuelos;
	}

	public double getKmVolados() {
		return kmVolados;
	}

	public String getCompannia() {
		return compannia;
	}
	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}

	private void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}

	private void setNumVuelos(Integer numVuelos) {
		this.numVuelos = numVuelos;
	}

	private void setKmVolados(Double kmVolados) {
		this.kmVolados = kmVolados;
	}

	@Override
	public String toString() {
		return "Avion con id " + getIdAvion() 
				+ ", de la compañia=" + getCompannia() 
				+ ", ha realizado " + getNumVuelos() 
				+ " vuelos,\n  con un total de " + getKmVolados() 
				+ "km y una media de "+ getMediaKm() + "km por vuelo";
	}
}
