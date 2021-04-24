package ar.edu.ort.tp3.ejer2;

import java.util.ArrayList;

public class TP3Test2 {

	public static void main(String[] args) {

		
		Empleado pedro = new Vendedor("Pedro",25,100,200,5);
		Empleado maria = new Vendedor("Maria",30,100,200,10);
		
		ArrayList empleados = new ArrayList<Empleado>();
		empleados.add(pedro);
		empleados.add(maria);
		
		for (int i = 0; i < empleados.size(); i++) {
			if(empleados.get(i) instanceof Vendedor) {
				System.out.println("Vendedor "+(i+1)+" "+empleados.get(i).toString());
			}
		}

	}

}
