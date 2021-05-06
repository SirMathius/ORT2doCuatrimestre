import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

	ArrayList<String> array_nombres;
	ArrayList<Integer> array_cantidades;
	ArrayList<Integer> array_precio;

	public Pedido() {
		array_nombres = new ArrayList<>();
		array_cantidades = new ArrayList<>();
		array_precio = new ArrayList<>();
	}

	public void agregarProductos(ArrayList<String> productos, ArrayList<Integer> cantidades,
			ArrayList<Integer> precios) {

		Scanner scan = new Scanner(System.in);
		int opcion = -1;
		int cantidad = 0;
		
		int posRepetido = -1;

		System.out.println("ingrese producto");
		opcion = scan.nextInt();
		opcion--;

		while (opcion != -1) {

			System.out.println("ingrese la cantidad");
			cantidad = scan.nextInt();
			
			posRepetido = this.productoRepetido(productos.get(opcion));
			if(posRepetido > -1) {
				this.array_cantidades.set(posRepetido, this.array_cantidades.get(posRepetido) + cantidad);
			} else {
				this.array_nombres.add(productos.get(opcion));
				this.array_cantidades.add(cantidad);
				this.array_precio.add(precios.get(opcion));
			}

			

			//this.array_cantidades.set(opcion, array_cantidades.get(opcion) + cantidad);

			opcion++;

			System.out.println("ingrese producto");
			opcion = scan.nextInt();
			opcion--;
		}

		scan.close();
	}

	private int productoRepetido(String string) {
		return array_nombres.indexOf(string);
	}

}
