package examen.ejercicio1;

import java.awt.Color;

public class Cuadrado extends FigurasGeometricas {

	private float lado;

	public Cuadrado(float x, float y, Color color, boolean relleno, float lado) {
		super(x, y, color, relleno);
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]" + super.toString();
	}

}
