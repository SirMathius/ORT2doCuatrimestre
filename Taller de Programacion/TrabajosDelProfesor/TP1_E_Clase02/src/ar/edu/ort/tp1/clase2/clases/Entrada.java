package ar.edu.ort.tp1.clase2.clases;

public class Entrada {
	//Info función
	private String dia;
	private String horaInicio;
	//info asiento.
	private int fila;
	private char letra;

	public Entrada(String dia, String horaInicio, int fila, char letra) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.fila = fila;
		this.letra = letra;
	}

	public String getDia() {
		return dia;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public int getFila() {
		return fila;
	}

	public char getLetra() {
		return letra;
	}

}
