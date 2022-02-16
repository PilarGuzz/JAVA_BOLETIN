package banco;

import java.util.Scanner;

public class Principal {
	

	private static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {

		Cuenta cuenta1 = null;
		System.out.println("¿Con qué saldo inicial quiere abrir su cuenta?*");
		Double saldoInicial = Double.valueOf(sc.nextLine());
		
		cuenta1= new Cuenta(saldoInicial);
		
		System.out.println("¿Que operacion desea realizar?");
		String op = sc.nextLine();
		
		while (!op.equals("4")) {
			
			if (op.equals("1")) {
				System.out.println("Cantidad a ingresar: ");
				double ingreso = Double.valueOf(sc.nextLine());
				
				if (cuenta1.hacerIngreso(ingreso)) {
					System.out.println("operacion realizada con exito");
				}else {
					System.out.println("Lo sentimos, no se puede realizar el ingreso");
				}
				
			}else if (op.equals("2")) {
				System.out.println("Cantidad a reintegrar: ");
				double reintegro = Double.valueOf(sc.nextLine());
				
				if (cuenta1.hacerIngreso(reintegro)) {
					System.out.println("operacion realizada con exito");
				}else {
					System.out.println("Lo sentimos, no se puede realizar el ingreso");
				}
				
				
			}else if (op.equals("3")) {
				System.out.println(cuenta1);
				
			}else if (op.equals("4")) {
				System.out.println("¿Seguro que quiere salir?S/N");
				String seleccion = sc.nextLine();
				if ("S") {
					
				}
			}
			
		}
				
		
		
		
		
		
		
	}

}
