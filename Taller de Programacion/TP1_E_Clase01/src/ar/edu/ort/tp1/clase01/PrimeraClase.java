package ar.edu.ort.tp1.clase01;

import java.util.ArrayList;

public class PrimeraClase {

	private int unEntero;
	private long unEnteroMasLargo;
	private float decimal;
	private double decimalMasLargo;
	private boolean bool;
	private char unChar;

	private String nombre;
	private Integer inInteger;
	private Long unEnteroMasLargoObj;

	private ArrayList<String> unaLista;
	private ArrayList<Integer> unaListaDeEnteros;

	private Billetera unaBilletera;

	private ArrayList<Billetera> billeteras;

	public PrimeraClase() {
		billeteras = new ArrayList<>();

	}

	public boolean agregarBilletera(Billetera b) {

		/*
		 * boolean retorno = false;
		 * 
		 * retorno = billeteras.add(b);
		 * 
		 * return retorno;
		 */

		return billeteras.add(b);
	}

	public void mostrarBilleteras() {
		for (Billetera billetera : billeteras) {
			System.out.println(billetera);
		}

		for (int i = 0; i < this.billeteras.size(); i++) {
			
			System.out.println(i +": " + this.billeteras.get(i).toString());

		}
		
		int idx = 0;
		while (idx < this.billeteras.size()) {
			System.out.println(idx +": " + this.billeteras.get(idx));
			idx ++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeraClase primeraClase = new PrimeraClase();

		primeraClase.agregarBilletera(new Billetera(10));
		primeraClase.agregarBilletera(new Billetera(25));
		primeraClase.agregarBilletera(new Billetera(33));
		primeraClase.agregarBilletera(new Billetera(1005584));
		System.out.println("Estoy bien!");
		
		primeraClase.mostrarBilleteras();

	}

}
