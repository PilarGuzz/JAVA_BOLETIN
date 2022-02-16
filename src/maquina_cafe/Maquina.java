package maquina_cafe;

public class Maquina {
	
	private final int CAPACIDAD_MAX_CAFE		= 50;
	private final int CAPACIDAD_MAX_lECHE		= 50;
	private final int CAPACIDAD_MAX_VASOS		= 80;
	
	
	private  Integer depositCafe;
	private  Integer depositLeche;
	private  Integer depositVaso;
	
	private Double monedero;
	private final Double precioCafe = 1.0;
	private final Double precioLeche = 0.8;
	private final Double precioCafeLeche = 1.5;
	
	
	
	public Maquina(double monedero) {
		llenarDepositos();
		
	}
	
	public void llenarDepositos() {
		this.depositCafe = CAPACIDAD_MAX_CAFE;
		this.depositLeche = CAPACIDAD_MAX_lECHE;
		this.depositVaso = CAPACIDAD_MAX_VASOS;
	}
	
	/*excepciones:
	 * si los depositos estan vacios
	 * si no hay cambio en el monedero
	 */

}


