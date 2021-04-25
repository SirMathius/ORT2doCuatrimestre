package ar.edu.ort.tp3.ejer5;

public class TorneoFutbol8 extends TorneoFutbol{

	public TorneoFutbol8() {
		super();
	}

	@Override
	public String getTipo() {
		return "Torneo de futbol 8";
	}

	@Override
	public int puntajePartidoGanado() {
		return 3;
	}

	@Override
	public int puntajePartidoPerdido() {
		return 1;
	}

	@Override
	public int puntajeVallaInvicta() {
		return 1;
	}

	@Override
	public int puntajeGanador4Goles() {
		return 0;
	}

	@Override
	public int puntajeEmpateMas3Goles() {
		return 1;
	}

}
