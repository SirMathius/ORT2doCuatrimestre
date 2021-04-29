
public class TrianguloEquilatero extends Figura {

	public TrianguloEquilatero(String color, double lado) {
		super(color);

		this.lado = lado;

	}

	double lado;

	public double altura() {
		return (Math.sqrt(3 * lado)) / 2;
	}

	@Override
	public double area() {
		return lado * this.altura();
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado * 3;
	}

}
