package ar.edu.ort.tp3.ejer4;

public class TP3Test3 {

	public static void main(String[] args) {

		
		Electrodomestico h1 = new Heladera("Heladera", "Whirlpool", "H2745", 123456, 250, false, 14999, 100, false);				
		//		Heladera Whirlpool, modelo H2745, no frost, capacidad 250 litros: $14999.
		Electrodomestico t1 = new Televisor("Televisor", "Philips", "49PGFS", 789456, 130, false, 14370, 49, true);
		//		Televisor smart Philips 49 pulgadas, modelo 49PGFS: $14370.
		Electrodomestico l1 = new Lavarropa("Lavarropas", "Drean", "CONCEPT", 456982, 175, false, 6799, 6, true);
		//		Lavarropas Drean semi autom�tico, carga m�xima 6kg, modelo CONCEPT 5.05: $6799.

		
		//Crear un programa que permita cargar una lista de art�culos y luego ofrecer al usuario esos productos. Solo se
		//deber� mostrar el tipo de producto, la marca y el modelo.
		
		// creo tienda
		Tienda ejemplo = new Tienda();
		// agrego productos
		ejemplo.agregarProductos(h1);
		ejemplo.agregarProductos(t1);
		ejemplo.agregarProductos(l1);
		// muestro productos
		ejemplo.mostrarProductos();
		
		//Una vez que el usuario elija, se deber� mostrar del
		//detalle completo y solicitarle al usuario que confirme la selecci�n. Continuar ofreci�ndole art�culos hasta que
		//el usuario elija la opci�n �0�. En ese momento se deber� imprimir el ticket completo con la infromacion de
		//todos los art�culos elegidos y el importe total de la venta. 

		//Usuario elije productos
		
		ejemplo.mostrarPedido();
		
		
	}

}
