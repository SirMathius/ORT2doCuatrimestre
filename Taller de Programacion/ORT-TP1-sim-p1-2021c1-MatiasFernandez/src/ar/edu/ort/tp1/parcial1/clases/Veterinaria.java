package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Veterinaria implements Mostrable {

	private static final String TXT_INGRESO = "Ingresando a %s a la veterinaria \n";
	private static final String TXT_CANTIDADES = "Han sido ingresados: %d conejos, %d gatos y %d perros\n";
	private String nombre;
	private Doctor doctor;
	private ArrayList<Mascota> animalesIngresados;

	public Veterinaria(String nombre, Doctor doctor) {
		this.doctor = doctor;
		this.nombre = nombre;
		this.animalesIngresados = new ArrayList<>();
	}

	public void admitirMascota(Mascota mascota) {
		this.animalesIngresados.add(mascota);
		System.out.printf(TXT_INGRESO, mascota.getNombre());
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		boolean encontrado = false;
		int index = 0;
		Mascota mascotaBuscada = null;
		while (!encontrado && index < animalesIngresados.size()) {
			if (animalesIngresados.get(index).getNombre().equals(nombreDeMascota)) {
				mascotaBuscada = animalesIngresados.get(index);
				encontrado = true;
			} else {
				index++;
			}
		}
		return mascotaBuscada;
	}

	public void vacunar() {
		int mascotasVacunadas = 0;
		for (Mascota mascota : animalesIngresados) {
			if (!mascota.estaVacunada()) {

				mascotasVacunadas++;

			}
		}
		System.out.println("Vacunas aplicadas: " + mascotasVacunadas);
	}

	@Override
	public void mostrar() {
		/*
		 * Veterinaria: Cuidamos tu mascota Doctor de Turno: Veterinovich Han sido
		 * ingresados: 2 conejos, 3 gatos y 3 perros
		 */
		int conejos = 0;
		int gatos = 0;
		int perros = 0;

		for (Mascota mascota : animalesIngresados) {
			if (mascota instanceof Gato) {
				gatos++;

			} else if (mascota instanceof Perro) {
				perros++;

			} else {
				conejos++;
			}
		}

		System.out.println("Veterinaria: " + this.nombre);
		System.out.println("Doctor de turno: " + this.doctor.getNombre());
		System.out.printf(TXT_CANTIDADES, conejos, gatos, perros);
	}

}
