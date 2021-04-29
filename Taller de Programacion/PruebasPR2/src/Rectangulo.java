
public class Rectangulo extends Figura {

	private double base;
	private double altura;

	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {

		return base * altura;
	}

	@Override
	public double perimetro() {

		return (base * 2) + (altura * 2);
	}

}
