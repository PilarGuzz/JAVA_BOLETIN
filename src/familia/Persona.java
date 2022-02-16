package familia;

public class Persona {
	
	
	private Integer edad;
	private String apellido1;
	private String nombre;
	private String dni;
	private double altura;
	private double peso;
	
	private Persona progenitor1;
	private Persona progenitor2;
	
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido;
		this.dni = dni;
		
	}
	
	
	public boolean esHermano(Persona personaDesconocida) {
		boolean sonHermanos = false;
		
		
		sonHermanos = !this.equals(personaDesconocida) 
				&& this.progenitor1.equals(personaDesconocida.getProgenitor1())
				&& this.progenitor2.equals(personaDesconocida.getProgenitor2());
		
		return sonHermanos;
		
	}
	@Override
	public String toString() {
	
		return super.toString();
	}
	
	
	public Integer getEdad() {
		return edad;
	}
	public String getApellido1() {
		return apellido1;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	public Persona getProgenitor1() {
		return progenitor1;
	}
	public Persona getProgenitor2() {
		return progenitor2;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setProgenitor1(Persona progenitor1) {
		this.progenitor1 = progenitor1;
	}
	public void setProgenitor2(Persona progenitor2) {
		this.progenitor2 = progenitor2;
	}

	@Override
	public boolean equals(Object personaDesconocida) {
		boolean sonLaMismaPersona = false;
		
		Persona convertida = (Persona) personaDesconocida;
		sonLaMismaPersona = this.dni.equals(convertida.getDni())
				&& this.nombre.equalsIgnoreCase(convertida.getNombre());
		
		return sonLaMismaPersona;
	}
	

	



}
