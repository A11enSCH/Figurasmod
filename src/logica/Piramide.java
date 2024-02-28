package logica;

public class Piramide extends Triangulo implements Cuerpo{
	private double valor2;

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public Piramide(double valor1, double valor2) {
		super (valor1, valor2);		
		this.valor2 = valor2;
	}
	
	public Piramide() {
		super();
		this.valor2 = 0;
	}

	@Override
	public double volumen() {
		return (Math.pow(valor1, 2)*valor2)/3;
	}
}
