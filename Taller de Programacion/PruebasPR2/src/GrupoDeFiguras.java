import java.util.ArrayList;

public class GrupoDeFiguras {

	private ArrayList<Figura> figuras; 

	
	public GrupoDeFiguras() {
		ArrayList<Figura> figuras = new ArrayList<>();
	}
	
	public void mostrarInfoDeFiguras() {

	for (Figura figura : figuras) {
		System.out.println("Color de la figura: " + figura.getColor());
		System.out.println("Perimoetro de la figura: " + figura.perimetro());
		System.out.println("Area de la figura: " + figura.area());
	}
	
	}
}
