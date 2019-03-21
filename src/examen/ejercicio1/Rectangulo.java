package examen.ejercicio1;

import java.awt.Color;

public class Rectangulo extends FigurasGeometricas {

	private float altura;
	private float base;

	public Rectangulo(float x, float y, Color color, boolean relleno, float altura, float base) {
		super(x, y, color, relleno);

		this.altura = altura;
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", base=" + base + "]" + super.toString();
	}

}
