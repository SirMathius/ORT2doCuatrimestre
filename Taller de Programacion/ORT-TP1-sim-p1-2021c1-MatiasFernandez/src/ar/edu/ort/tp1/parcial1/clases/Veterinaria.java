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
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		boolean encontrado = false;
		int index = 0;
		Mascota mascotaBuscada = null;
		while (!encontrado && index < animalesIngresados.size()) {
			if (animalesIngresados.get(index).getNombre().equals(nombreDeMascota)) {
				mascotaBuscada = animalesIngresados.get(index);
				encontrado = true;
			}else {
				index++;
			}
		}
		return mascotaBuscada;
	}

	public void vacunar() {
		// TODO A completar
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

}
