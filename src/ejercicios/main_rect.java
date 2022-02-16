package ejercicios;

import java.util.Scanner;

public class main_rect {

	public static void main(String[] args) throws Exception {
		Rectangulo r1= null;
		
		Scanner sc = new Scanner(System.in);
		
		while(r1==null) {
			System.out.println("¿Cual es el ancho del rectangulo?");
			int ancho = Integer.valueOf(sc.nextLine());
		
			System.out.println("¿Cual es la longitud del rectangulo?");
			int longitud = Integer.valueOf(sc.nextLine());
			
			try {
				r1 = new Rectangulo (ancho, longitud);
				
				
			} catch (RectanguloException errorRect) {
				System.out.println("Se ha producido una excepcion: " + errorRect.getMessage());
				
			}
		}
			
		
		
		Rectangulo rectCreado;
		
//		System.out.println("¿Cual es el ancho del rectangulo?");
//		int ancho = Integer.valueOf(sc.nextLine());
//		
//		System.out.println("¿Cual es la longitud del rectangulo?");
//		int longitud = Integer.valueOf(sc.nextLine());
		
		rectCreado = new Rectangulo (4, 6) ;
		
	//	System.out.println("El area del rectangulo es " + rectCreado.area(4,6));
	//	System.out.println("El perimetro del rectangulo es " + rectCreado.perimetro(4, 6));
	}

}
