package ar.edu.ort.tp1.clase1;

public class Billetera {
	private float saldo;
	
	public Billetera() {
		this.saldo = 0;
	}
	
	public Billetera(float saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public void agregarPlata(float cantidad) {
		
		this.saldo = saldo + cantidad;

//		this.saldo += cantidad;	
	}
	
	@Override
	public String toString() {
		return "Mi saldo es: " + this.saldo;
	}
	
	
	
	
	
	
	
	
}
