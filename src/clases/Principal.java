package clases;

public class Principal {

	public static void main(String[] args) {
		
		Persona antonio = new Persona("Antonio","Sevillano", 50, 1.72);
		Persona maria = new Persona();
		
		String cadena = new String ("cadena de texto");
		
		antonio.setAltura(1.8);
		antonio.setEdad(300);
		antonio.setNombre ("Antonio");
		antonio.setApellidos("Sevillano");
		
		maria.setAltura(1.9);
		maria.setEdad(25);
		maria.setNombre("María");
		maria.setApellidos("Gutierrez");
		
		
		System.out.println(antonio);

	}

}
