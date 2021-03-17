package ar.edu.ort.tp1.clase2.clases;

public class Asiento {

	private int fila;
	private char letra;
	private EstadoAsiento estado;
	public Asiento(int fila, char letra) {

		this.fila = fila;
		this.letra = letra;
		this.estado = EstadoAsiento.LIBRE;
	}
	
	public void marcarCumplido() {
		this.estado = EstadoAsiento.CUMPLIDO;
	}

	public boolean esTuFilaLetra(int fila, char letra) {
		return this.fila == fila && this.letra == letra;
	}

	public boolean estasReservado() {
		return EstadoAsiento.RESERVADO == this.estado;
	}
	
}
