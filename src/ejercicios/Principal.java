package ejercicios;

import java.util.Scanner;

public class Principal {
		
		public static String MENU_SECUNDARIO = "Selecciona opcion: \n"
												+"a. Asignar vuelo\n"
												+"b. Obtener el número de vuelos\n"
												+"c. Obtener el número de kilómetros\n"
												+"d. Obtener la media de kilómetros por vuelo\n"
												+"e. Cambio de compañía \n"
												+"f. Mostrar información del avión\n"
												+"g. Salir";

		
		
		public static void main(String[] args) {
			
			crearAeropuerto();
			
//			Avion jumbo = crearAvionConMenu();
//
//			
//			
//			System.out.println(MENU_SECUNDARIO);
//			
//			Scanner sc = new Scanner (System.in);
//			String opcion = sc.nextLine();
//			
//			while (!opcion.equalsIgnoreCase("g")) {
//				
//				if (opcion.equalsIgnoreCase("a")) {
//					
//					System.out.println("¿Cuántos viajeros van en este viaje? ");
//					int viajero = Integer.valueOf(sc.nextLine());
//					
//					System.out.println("¿Cuantos kms recorre en este viaje?");
//					int kms = Integer.valueOf(sc.nextLine());
//					
//					if (jumbo.asignarVuelo(viajero, kms)) {
//						System.out.println(jumbo);
//					}else {
//						System.out.println("El numero de pasajeros excede la capacidad del avion");
//					}
//					
//				}else if (opcion.equalsIgnoreCase("b")) {
//					System.out.println(jumbo.getNumVuelos());
//					
//				}else if (opcion.equalsIgnoreCase("c")) {
//					System.out.println(jumbo.getKmVolados());
//					
//				}else if (opcion.equalsIgnoreCase("d")) {
//					System.out.println(jumbo.getMediaKm());
//					
//				}else if (opcion.equalsIgnoreCase("e")) {
//					System.out.println("Asigne la compañia compradora: ");
//					String compannia = sc.nextLine();
//					jumbo.setCompannia(compannia);
//				}else if (opcion.equalsIgnoreCase("f")) {
//					System.out.println(jumbo.toString());
//				}
//				System.out.println("---------------------------------------------------------------");
//				System.out.println(MENU_SECUNDARIO);
//				
//				opcion= sc.nextLine();
				
//			}
	
		
		
		//System.out.println(jumbo);

	}

//	public static Avion crearAvionConMenu() {
//		System.out.println("MENU CREACION DE AVION. \n"
//				+ "1. Crear avión sólo con el identificador.\n"
//				+ "2. Crear avión con el identificador y la compañía.\n"
//				+ "#########################################################");
//		
//		int capacidad = 0;
//		Avion avionCreado = null;
//		
//		Scanner sc = new Scanner (System.in);
//		int op = Integer.valueOf(sc.nextLine());
//		
//		if (op==1) {
//			
//			System.out.println("Introduzca el identificador del avion: ");
//			String identificador = sc.nextLine();
//			System.out.println("Introduzca la capacidad del avion: ");
//			capacidad = Integer.valueOf(sc.nextLine());
//			
//			avionCreado = new Avion (identificador, capacidad);
//			
//			
//		}else if (op==2) {
//			
//			System.out.println("Introduzca el identificador del avion: ");
//			String identificador = sc.nextLine();
//			capacidad = Integer.valueOf(sc.nextLine());
//			System.out.println("Introduzca la compañia del avion: ");
//			String compania = sc.nextLine();
//			System.out.println("Introduzca la capacidad del avion: ");
//		
//			
//			avionCreado = new Avion (identificador,compania, capacidad);
//			
//		}else {
//			System.out.println("Laopcion seleccionada no es correcta");
//		}
//	
//		
//		return avionCreado;
//		
//	}
	
	public static void crearParqueAeropuerto() {
		Avion boeing = new Avion ("boeing12", 120);
		Avion avion2 = new Avion ("avion2", 150);

		
		Avion[]aeropuerto = new Avion [58];
		aeropuerto[2] = boeing; //Se indica aparcar el boeing en plaza 3.
		aeropuerto[0]= avion2;
		
		aeropuerto[1]= new Avion("pacoryanair", 250);
		
		
		int[] arrayNumeros = new int [10]; //se declara y reserva 10 espacios para datos.
		arrayNumeros[3]=15; //posicion 4º valor 15, empieza en posicion 0.
		
	}
	public static void crearAeropuerto() {
		int contador = 0;
		Avion[]aeropuertoSVQ = new Avion [50];

		while (contador <50) {
			aeropuertoSVQ[contador]= new Avion("avion"+contador, 250);
			
			contador ++;

		}
		for (int i = 0; i <aeropuertoSVQ.length; i++) {
			System.out.println(aeropuertoSVQ[i]);
		}
	
	}

}
