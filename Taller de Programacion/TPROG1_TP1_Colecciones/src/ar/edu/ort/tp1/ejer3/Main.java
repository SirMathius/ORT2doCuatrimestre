package ar.edu.ort.tp1.ejer3;

public class Main {

	public static void main(String[] args) {
		
		Carrera carrera = new Carrera(100, Especialidad.MARATON);
		carrera.agregarAtleta("Mattso", 1);
		carrera.agregarAtleta("Otro Mattso", 3);
		carrera.agregarAtleta("Pepe", 2);
		carrera.agregarAtleta("Otro Pepe", 2);
		
		carrera.agregarAtleta("Pipo", 5);
		carrera.agregarAtleta("Popo", 4);
		carrera.agregarAtleta("Rogelio", 6);
		
		carrera.mostarGanador();
		carrera.mostarPodio();

	}

}
