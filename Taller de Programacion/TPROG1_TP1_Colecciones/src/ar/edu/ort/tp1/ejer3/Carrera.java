package ar.edu.ort.tp1.ejer3;

import java.util.ArrayList;
import java.util.Comparator;

public class Carrera {

	private int distancia;
	private ArrayList<Atleta> atletas;
	private Especialidad especialidad;

	// Constructor

	public Carrera(int distancia, Especialidad especialidad) {
		this.distancia = distancia;
		this.especialidad = especialidad;
		this.atletas = new ArrayList<>();
	}

	// Metodos

	public void agregarAtleta(String nombre, double tiempo) {
		Atleta atleta = new Atleta(nombre, tiempo);
		atletas.add(atleta);

	}

	public void mostarGanador() {
		double menorTiempo = Double.MAX_VALUE;
		
		for (Atleta atleta : atletas) {
			if(atleta.getTiempo() < menorTiempo) {
				menorTiempo = atleta.getTiempo();
			}
		}
		
		System.out.println("El ganador es: ");

		for (int idx = 0; idx < this.atletas.size(); idx++) {

			if (atletas.get(idx).getTiempo() == menorTiempo) {

				System.out.println(atletas.get(idx).getNombre());

			}

		}
		
	}
	
	public void mostarPodio() {
		
		this.ordenarPorTiempos();
		double menorTiempo = Double.MAX_VALUE;
		
		for (Atleta atleta : atletas) {
			if(atleta.getTiempo() < menorTiempo) {
				menorTiempo = atleta.getTiempo();
			}
		}
		
		System.out.println("\nPodio: ");

		int idx = 0;
		int puestos = 1;
		
		while (idx < atletas.size() && idx + 1 < atletas.size() && puestos <= 3) {
			
			System.out.println("Puesto Nº " + puestos + ": " + atletas.get(idx).getNombre());
			
			if (atletas.get(idx + 1).getTiempo() >  atletas.get(idx).getTiempo()) {
				puestos++;
			}
						
			idx++;
			
		}
		
	}
	
	public void mostarGanador_ALT() {
		this.ordenarPorTiempos();
		
		int idx = 0;
		double menorTiempo = atletas.get(0).getTiempo();
		
		System.out.println("El ganador es: ");
		
		do {
			System.out.println(atletas.get(idx).getNombre());
			idx++;
		} while (idx < atletas.size() && atletas.get(idx).getTiempo() == menorTiempo);
		
	}
	
	private void ordenarPorTiempos() {
		atletas.sort(new Comparator<Atleta>() {

			@Override
			public int compare(Atleta o1, Atleta o2) {
				
				if(o1.getTiempo() < o2.getTiempo()) {
					return -1;
				} else if(o1.getTiempo() == o2.getTiempo()) {
					return 0;
				} else {
					return 1;
				}
			}
		});
	}

}
