package examen.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		ArrayList<String> compuestos = new ArrayList<>();
		int iterador = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Cuantos Compuestos vas a poner?");
		int numfil = teclado.nextInt();

		do {
			System.out.println("Introduce el compuesto");
			String compuesto = teclado.next();
			compuestos.add(new String(compuesto));
			iterador++;
		} while (iterador < numfil);

		System.out.println();
		System.out.print(compuestos);

	}

}
