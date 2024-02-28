package logica;

public class Cilindro extends Circulo implements Cuerpo{
	private double valor2;

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}
	
	public Cilindro(double valor1, double valor2) {
		super(valor1);		
		this.valor2 = valor2;
	}
	
	public Cilindro() {
		super();
		this.valor2 = 0;
	}
	
	public Cilindro(double valor1) {
		super(valor1);
	}
	
	@Override
	public double volumen() {
		return Math.PI*Math.pow(valor1, 2)* valor2;
	}

}
