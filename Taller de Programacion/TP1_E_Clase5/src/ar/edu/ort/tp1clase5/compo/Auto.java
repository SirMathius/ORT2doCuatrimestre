package ar.edu.ort.tp1clase5.compo;

public class Auto extends Vehiculo {
	
	private boolean aireAcondicionado;

	public Auto(String marca, String color) {
		super(marca, color);
		System.out.println("constructor Auto");
		this.aireAcondicionado = false; 
	}
	
	public Auto(String marca, String color, boolean aireAcondicionado) {
		super(marca, color);
		System.out.println("constructor Auto");
		this.aireAcondicionado = aireAcondicionado; 
	}
	
	public Auto(String marca, boolean aireAcondicionado) {
		super(marca);
		System.out.println("constructor Auto");
		this.aireAcondicionado = aireAcondicionado; 
	}

	public boolean hacerDrift() {
		System.out.println("hago drift");
		return false;
	}

	public void ejemploDeVisibilidad() {

		super.mostrarDatos();

		// no se puede acceder a miembros privados del padre
//		super.marca;
//		String unaVariable = super.marca;
//		super.unMetodoPrivado();
		super.elProfeSeSaca2 = false;
		if (elProfeSeSaca2) {

			System.out.println("esta mal");

		}

		super.valorProtegido = 2;
	}

	public void subirPasajero(Persona p) {

		System.out.println("abrir puerta");
		super.agregarPasajero(p);
		System.out.println("Cerramos puerta");
		System.out.println(atrivDefault);
	}

}
