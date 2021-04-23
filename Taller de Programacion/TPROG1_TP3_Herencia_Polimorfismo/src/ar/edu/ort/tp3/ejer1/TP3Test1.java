package ar.edu.ort.tp3.ejer1;

public class TP3Test1 {

	public static void main(String[] args) {

		
		Empleado jose = new Asalariado("Jose",30,10000);
		Empleado carlos = new SubContratado("Carlos", 23, 50, 100);
		
		System.out.println(jose.toString());
		System.out.println(carlos.toString());
		
	}

}
