package logica;

public class Paralelogramo extends Figura{
	private double valor2;
	
	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public Paralelogramo(double valor1, double valor2) {
		super(valor1);		
		this.valor2 = valor2;
	}
	
	public Paralelogramo() {
		super();
		this.valor2 = 0;
	}
	
	@Override
	public double area() {
		return valor1*valor2;
	}

	@Override
	public double perimetro() {
		return 2*(valor1+ Math.sqrt(Math.pow(this.valor1, 2) + Math.pow(this.valor2, 2)));
	}

}
