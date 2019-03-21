package examen.ejercicio2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import examen.ejercicio1.Circulo;
import examen.ejercicio1.Cuadrado;
import examen.ejercicio1.FigurasGeometricas;
import examen.ejercicio1.Rectangulo;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<FigurasGeometricas> lista = new ArrayList<>();
		lista.add(new Circulo(63f, 54f, Color.black, false, 6f));
		lista.add(new Cuadrado(71f, 45f, Color.blue, true, 7f));
		lista.add(new Rectangulo(22f, 114f, Color.gray, false, 8f, 12f));

		Mostrar(lista);
	}

	public static void Mostrar(List<FigurasGeometricas> lista) {
		Iterator<FigurasGeometricas> i = lista.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}