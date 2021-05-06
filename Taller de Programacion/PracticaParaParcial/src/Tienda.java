import java.util.ArrayList;
import java.util.Scanner;

public class Tienda implements mostrable {

	ArrayList<String> array_nombres;
	ArrayList<Integer> array_cantidades;
	ArrayList<Integer> array_precio;

	public Tienda() {
		array_nombres = new ArrayList<>();
		array_cantidades = new ArrayList<>();
		array_precio = new ArrayList<>();
	}

	public void agregarStock(String nombre, int cantidad, int precio) {
		array_nombres.add(nombre);
		array_cantidades.add(cantidad);
		array_precio.add(precio);
	}

	@Override
	public void mostrar() {
		for (int i = 0; i < array_nombres.size(); i++) {
			System.out.println((i + 1) + ") " + array_nombres.get(i) + ": " + array_cantidades.get(i) + " - $ "
					+ array_precio.get(i));
		}
	}
	
	public void tomarPedido()
	{

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
			
			posRepetido = this.productoRepetido(array_nombres.get(opcion));
			if(posRepetido > -1) {
				this.array_cantidades.set(posRepetido, this.array_cantidades.get(posRepetido) + cantidad);
			} else {
				this.array_nombres.add(array_nombres.get(opcion));
				this.array_cantidades.add(cantidad);
				this.array_precio.add(precios.get(opcion));
			}

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
