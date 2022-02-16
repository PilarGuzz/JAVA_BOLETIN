package banco;

public class Cuenta {
	
	private Double saldo;
	private int numIgresos;
	private int numReintegros;

	
	public Cuenta() {
		
	}
	//constructor
	public Cuenta (Double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	//metodo
	public boolean hacerIngreso(double cantidadAIngresar) {
		boolean exitoOperacion = false;
		
		if (cantidadAIngresar>=0) {
			this.saldo += cantidadAIngresar;
			this.numIgresos++;
			exitoOperacion = true;
		}
		
		return exitoOperacion;
		
	}
	
	public boolean hacerReintegros(double cantidadASacar) {
		boolean exitoOperacion = false;
		
		if (cantidadASacar <= this.saldo && cantidadASacar > 0) {
			this.saldo += cantidadASacar;
			this.numReintegros++;
			exitoOperacion = true;
		}
		
		return exitoOperacion;
	}
	
	//getter and setter
	private Double getSaldo() {
		return saldo;
	}

	private int getNumIgresos() {
		return numIgresos;
	}

	private int getNumReintegros() {
		return numReintegros;
	}

	private void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	private void setNumIgresos(int numIgresos) {
		this.numIgresos = numIgresos;
	}

	private void setNumReintegros(int numReintegros) {
		this.numReintegros = numReintegros;
	}
	
	public String toString() {
		return "La cuenta tiene un saldo de " + getSaldo()
		+ "€, se han realizado " + getNumIgresos() + " ingresos "
		+ "y " + getNumReintegros() + "reintegros.";
	}

}
