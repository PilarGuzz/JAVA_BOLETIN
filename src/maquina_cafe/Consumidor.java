package maquina_cafe;

import java.util.Scanner;

public class Consumidor {
	
	public static String MENU = " 1. Servir café solo (1euro) \n"
								+ "2. Servir leche (0.8 euros)\n"
								+ "3. Servir café con leche (1.5euros) \n"
								+ "4.Consultar estado máquina \n"
								+ "5. Apagar máquina y salir.";

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double monedero;
		System.out.println("Introduzca cantidad del monedero");
		monedero = Double.valueOf(sc.nextLine()); 
		
		Maquina nuevaMq = new Maquina(monedero);

	}

}
