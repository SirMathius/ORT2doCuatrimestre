package ar.edu.ort.tp3.ejer5;

import java.util.ArrayList;

public abstract class TorneoFutbol {

	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	
	public TorneoFutbol() {
		this.jornadas = new ArrayList<>();
		this.equipos = new ArrayList<>();
	}

	public void agregarJornada(Jornada jornada) {
		this.jornadas.add(jornada);
	}
	
	public void eliminarJornada(Jornada jornada) {
		this.jornadas.remove(jornada);
	}
	
	public void agregarEquipo(Equipo equipo) {
		this.equipos.add(equipo);
	}
	
	public void eliminarEquipo(Equipo equipo) {
		this.equipos.remove(equipo);
	}
	
	public void finalizarJornada(Jornada jornada) {
		if(jornadas.contains(jornada)) {
			for (Partido partido : jornada.getPartidos()) {
				this.calcularPuntos(partido);
			}
		}
	}
	
	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");
		for (Equipo equipo : equipos) {
			
			System.out.println(equipo.toString());
			
		}
	}
	
	public abstract String getTipo();
	
	public void calcularPuntos(Partido partido) {
		int puntosLocal				= 0;
		int puntosVisitante			= 0;
		int golesEquipoLocal 		= partido.getGolesEquipoLocal();
		int golesEquipoVisitante 	= partido.getGolesEquipoVisitante();
		
/*		if(golesEquipoLocal > golesEquipoVisitante)//Si gana el local
		{
			puntosLocal = puntosLocal+ 3;
			
			} else if(){//Si gana el visitante

				// Completar
	
			}*/
		}

	// Completar
	

	
	public int puntajePartidoEmpatado() {
		return 1;
	}
	public  int puntajePartidoGanado() {
		return 1;
	}
	
	public abstract int puntajePartidoPerdido();
	
	public abstract int puntajeVallaInvicta();
	
	public abstract int puntajeGanador4Goles();
	
	public abstract int puntajeEmpateMas3Goles();
	
}