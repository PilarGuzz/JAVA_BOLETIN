package ejercicios;

public class Rectangulo {
	//Atributos
	private Integer longitud = 1;
	private Integer ancho = 1;
	private String id;
	public static int contador = 1;
	
	//Constructor
	public Rectangulo (Integer ancho, Integer longitud) throws Exception {
		
		setAncho(ancho);
		setLongitud(longitud);
		
		this.id = "ID"+contador;
		this.contador++;
	
		}
	
	
	//métodos
	public int perimetro(int alto, int ancho) {
		
		return 2*this.longitud + 2*this.ancho;
	}
	
	public int area (int alto, int ancho) {
	
		
		return this.longitud * this.ancho;
	}
	
	
	
	//Getters and Setters
	public Integer getLongitud() {
		return longitud;
	}
	public Integer getAncho() {
		return ancho;
	}
	public void setLongitud(Integer longitud) throws Exception {
		if (longitud > 0 && longitud <= 20) {
			this.longitud = longitud;
		}else {
			throw new Exception("La longitud es erronea");
		}
	}
	public void setAncho(Integer ancho) {
		if (ancho > 0 && ancho <= 20) {
			this.ancho = ancho;
		}else {
			throw new RectanguloException("El ancho es erroneo");
		}
		
	}
	
	
	


}
