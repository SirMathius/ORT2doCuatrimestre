package ar.edu.ort.tp1clase5.compo;

import java.util.ArrayList;

public class Poligono {

	private class Coordenada {

		private int x;
		private int y;

		public Coordenada(int x, int y) {
			actualizarValores(x,y);
		}

		@Override
		public String toString() {
			return "[" + x + ", " + y + "]";
		}
		
		public void actualizarValores(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private Coordenada centro;
	private ArrayList<Coordenada> vertices;

	public Poligono(int x, int y) {
		centro = new Coordenada(x, y);
		vertices = new ArrayList<>();
	}

	public void agregarVertice(int i, int j) {
		vertices.add(new Coordenada(i, j));
	}
	
	 public int getCantidadDePuntos() {
		    return vertices.size();
		  }

	public void mostrar() {
		System.out.printf("El poligono tiene %d lados, con el centro en %s;\n", getCantidadDePuntos(), centro);
		System.out.print("Sus lados son ");
		System.out.println(coordenadasFinales());
	}

	private ArrayList<Coordenada> coordenadasFinales() {
		ArrayList<Coordenada> cf = new ArrayList<>();
		for (Coordenada vertice : vertices) {
			cf.add(new Coordenada(vertice.x + centro.x, vertice.y + centro.y));
		}
		return cf;
	}

	public void moverA(int x, int y) {
		this.centro.actualizarValores(x, y);
	}

	
}