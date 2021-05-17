package ar.edu.ort.tp1clase7;

public class EjExeptions2 {

	public static void main(String[] args) {

		Persona p1;

		try {
			p1 = new Persona("", 1980);
			System.out.println(p1);
		} catch (RuntimeException re) {
			System.out.println("Hubo un error: " + re.getMessage());
		}

		Persona p2;

		try {
			p2 = new Persona("asdasd", 100);
			System.out.println(p2);
		} catch (RuntimeException re) {
			System.out.println("Hubo un error: " + re.getMessage());
		}

		Persona p3;

		try {
			p3 = new Persona("asdasd", 1980);
			System.out.println(p3);
		} catch (RuntimeException re) {
			System.out.println("Hubo un error: " + re.getMessage());
		}

	}

}
