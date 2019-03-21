package examen.ejercicio1;

import java.awt.Color;

public class Circulo extends FigurasGeometricas {

	private float radio;

	public Circulo(float x, float y, Color color, boolean relleno, float radio) {
		super(x, y, color, relleno);

		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]" + super.toString();
	}

}
