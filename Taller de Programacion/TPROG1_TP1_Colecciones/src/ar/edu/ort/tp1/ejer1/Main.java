package ar.edu.ort.tp1.ejer1;
public class Main {

	public static void main(String[] args) {
		
		Grupo grupo = new Grupo("1");
		grupo.agregarIntegrante("Fernandez");
		grupo.agregarIntegrante("Pepe");
		
		existeIntegrante(grupo, "Fernandez");
		existeIntegrante(grupo,"Josele");
		
		grupo.mostrar();
		String removido =grupo.removerIntegrante("Pepe");
		System.out.println("Se removio integrante: " + removido);
		grupo.mostrar();
		removido = grupo.removerIntegrante("Pepe");
		System.out.println("Se removio integrante: " + removido);
		grupo.mostrar();
		grupo.vaciar();
		grupo.mostrar();
	
	}
	
	private static void existeIntegrante(Grupo grupo, String nuevo) {
		String integrante = grupo.buscarIntegrante(nuevo);

		if (integrante == null) {

			System.out.println("No existe integrante.");

		} else {
			System.out.println("Ya existe integrante.");
		}

	}
	
	

}
