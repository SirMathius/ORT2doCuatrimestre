
public class Main {

	public static void main(String[] args) {

		
		Taller t = new Taller();
		
		t.agregarBicicleta("marca1", "modelo1", 5000);
		t.agregarBicicleta("marca1", "modelo1", 6000, 120);
		t.agregarBicicleta("marca1", "modelo1", 1600);
		t.agregarBicicleta("marca1", "modelo1", 1500, 600);
		t.agregarBicicleta("marca1", "modelo1", 900);
		
		
		int posibles = t.cantServiciosPosibles();
		System.out.println(posibles);
		
	}

}
