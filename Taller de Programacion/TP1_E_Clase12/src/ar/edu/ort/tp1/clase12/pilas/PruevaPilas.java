package ar.edu.ort.tp1.clase12.pilas;

import ar.edu.ort.tp1.tdas.implementaciones.PilaNodos;

public class PruevaPilas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pila sin limite de cantidad de elementos
		PilaNodos<String> pila = new PilaNodos<String>();
		
		//Pila con capasidad limitada. (en este caso 10)
		PilaNodos<String> pila2 = new PilaNodos<String>(10);
		
		pila2.push("Hola");
		String s = pila2.peek(); //solo muestra
		System.out.println(s);
		String s3 = pila2.pop(); //saca
		System.out.println(s3);
		if (!pila2.isEmpty()) {
			String s2 = pila2.pop(); 
			System.out.println(s2);
		}
		System.out.println("------------------");
		
		pila.push("Patente A");
		pila.push("Patente Z");
		pila.push("Patente G");
		pila.push("Patente E");
		
		boolean esta = estaPatente(pila, "atente Z");
		
		int cantElementos = contar(pila);
		
		mostrarElementos(pila);
		
		//pilla tiene que estar igual

	}

	private static boolean estaPatente(PilaNodos<String> pila, String patenteBuscada) {
		
		PilaNodos<String> pilaAux = new PilaNodos<>();
		boolean esta = false;
		
		while (!pila.isEmpty() && !esta) {
			//Sacar elementos y ver que busco
			String elemento = pila.pop();
			esta = elemento == patenteBuscada;
			pilaAux.push(elemento); 
			
		}
		
		while (!pilaAux.isEmpty()) {
			pila.push(pilaAux.pop());
			
		}
		
		return esta;
	}

}
