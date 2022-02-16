package clases;

public class Persona {
	
	//atributo --> caracteristica
	private String nombre;
	private String apellidos;
	private int edad;
	private double altura;
	
	//constructor
	public Persona() {
		apellidos = "apellido vacio";
		nombre = "nombre vacio";
		edad = 18;
		altura = 1.70;
		
	}
	public Persona (String name, String apellidos, int age, double height) {
		if (!name.isEmpty()) {
			this.nombre = name;
		}
		if (!apellidos.isEmpty()) {
			this.apellidos=apellidos;
		}
		if (age > 0 && age <150) {
			edad = age;
		}
		if (height > 0 && height <3) {
			altura = height;
		}
		
	}
	
	//metodo
	public void saludar() {
		System.out.println("Hola");
	}
	
	//getter y setter
	public void setEdad(int edad) {
		if (edad > 0 && edad <150) {
			this.edad = edad;
		}
		
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
