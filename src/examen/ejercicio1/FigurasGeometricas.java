package examen.ejercicio1;

import java.awt.Color;

public abstract class FigurasGeometricas {

	private float x;
	private float y;
	private Color color;
	private boolean relleno;

	public FigurasGeometricas(float x, float y, Color color, boolean relleno) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.relleno = relleno;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public Color getColor() {
		return color;
	}

	public boolean isRelleno() {
		return relleno;
	}

	@Override
	public String toString() {
		return "FigurasGeometricas [x=" + x + ", y=" + y + ", color=" + color + ", relleno=" + relleno + "]";
	}

}
