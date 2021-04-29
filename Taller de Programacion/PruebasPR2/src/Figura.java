
public abstract class Figura {

	public Figura(String color) {
		this.color = color;
	}
	private String color;
	
	public abstract double area();
	public abstract double perimetro();
	public void mostrar() {
		System.out.println(this.color);
	}
	public String getColor() {
		return this.color;
	}

}
