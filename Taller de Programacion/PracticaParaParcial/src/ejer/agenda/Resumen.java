package ejer.agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Resumen {

	/**
	 * Una persona lleva la cuenta de sus gastos personales mensuales Quieren
	 * ingresar por mes cuanto dinero cobrò y cuanto dinero gastò por cada mes, se
	 * tiene que pedir ambos valores hasta que la persona ingresa -1. (puede
	 * no haber tenido gastos ni ingresos un mes, pero no pueden ser negativos)
	 * cuando se terminan todos los meses, imprimir el resumen de ingresos y gastos,
	 * con el neto del mes y el balance
	 */
	
	private ArrayList<String> meses;
	private ArrayList<Integer> dineroCobrado;
	private ArrayList<Integer> dineroGastado;
	
	public Resumen() {
		this.dineroCobrado = new ArrayList<>();
		this.dineroGastado = new ArrayList<>();
		this.meses = new ArrayList<>();
	}
	
	public void ingresarValores() {
		
		Scanner scan = new Scanner(System.in);
		
		int cobro = 0;
		int gasto = 0;

		
		System.out.println("Dinero cobrado este mes:");
		cobro = scan.nextInt();
		
		while (cobro != -1 && dineroCobrado.size() < meses.size()) {
			
			System.out.println("Dinero gastado este mes: ");
			gasto = scan.nextInt();
			
			dineroCobrado.add(cobro);
			dineroGastado.add(gasto);
			
			System.out.println("Dinero cobrado este mes:");
			cobro = scan.nextInt();
		}
		
		scan.close();
	}
	
	public void imprimirResumen() {
		
		int totalCobrado = 0;
		int totalGastado = 0;
		int balance = 0;
		int neto= 0;
		
		for (int i = 0; i < dineroCobrado.size(); i++) {
			
			System.out.println(meses.get(i));
			System.out.println("Ingreso $"+ dineroCobrado.get(i)+ "       gastos $"+dineroGastado.get(i));
			neto = dineroCobrado.get(i) - dineroGastado.get(i);
			balance= balance + neto;
			System.out.println("Neto $"+neto+"       balance $"+balance);
			
			totalCobrado = totalCobrado + dineroCobrado.get(i);
			totalGastado = totalGastado + dineroGastado.get(i);
			
			
		}
		
		balance = totalCobrado - totalGastado;
		
		System.out.println("Total cobrado: $"+totalCobrado);
		System.out.println("Total gastado: $"+totalGastado);
		System.out.println("Balance: $"+balance);
	}
	
	public void agregarMes (String mes) {
		meses.add(mes);
	}
}
