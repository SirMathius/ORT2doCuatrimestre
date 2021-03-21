package ar.edu.ort.tp1.ejer2;

public class Main {

	public static void main(String[] args) {
		
		Carrera carrera = new Carrera(100, Especialidad.MARATON);
		carrera.agregarAtleta("Mattso", 1000);
		carrera.agregarAtleta("Pepe", 9898);
		carrera.agregarAtleta("Otro Mattso", 1000);
		
		carrera.mostarGanador();
		carrera.mostarGanador_ALT();

	}

}
