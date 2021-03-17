package ar.edu.ort.tp1.clase2;

import java.util.ArrayList;

import ar.edu.ort.tp1.clase2.clases.Cine;
import ar.edu.ort.tp1.clase2.clases.Entrada;

public class Main {

	public static void main(String[] args) {
		Cine c = new Cine("ORT BUSTER", "Toy Story 4");
		
		ArrayList<Entrada> entradas = new ArrayList<>();
		
		entradas.add(new Entrada("a", "a", 1, 'C'));
		entradas.add(new Entrada("a", "a", 3, 'A'));
		entradas.add(new Entrada("a", "a", 6, 'F'));
		
		boolean resultado = c.procesarEntradas(entradas);
		System.out.println("El resultado fue: " + resultado);
		
	}

}
