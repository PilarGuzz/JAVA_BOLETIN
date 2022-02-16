package familia;

public class GestionFamiliaApp {

	public static void main(String[] args) {
		
		Persona juan = new Persona("Juan", "Martin", "1234A");
		Persona paco = new Persona("Paco", "Martin", "1234B");
		
		Persona madre = new Persona("Rocío", "González", "1234C");
		Persona padre = new Persona("Juan", "Martin", "1234D");
		
		juan.setProgenitor1(padre);
		juan.setProgenitor2(madre);
		
		paco.setProgenitor1(padre);
		paco.setProgenitor2(madre);

		System.out.println(juan.esHermano(paco));
		

		

	}

}
