
public class Circunferencia extends Figura {
	
	private double radio;

	public Circunferencia(String color, double radio) {
		super(color);
		this.radio= radio;
	}


	@Override
	public double area() {
		
		return 3.14* Math.pow(radio, 2);
	}

	@Override
	public double perimetro() {
		
		return 3.14*2*radio;
	}

}
