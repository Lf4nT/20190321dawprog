package examen.ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		ArrayList<String> ListaTelefonos = new ArrayList<>();
		Scanner teclado = new Scanner(System.in);
		int respuesta = 0;

		do {
			System.out.println("Realiza la accion");
			String accion = teclado.next();
			if (accion.contains(" "))
				throw new IllegalArgumentException("Sin espacios porfavor");
			if (accion.contains("-")) {
				System.out.print("Añadir: " + accion);
				ListaTelefonos.add(new String(accion));
			} else if (accion.contains(":")) {
				System.out.print("Buscar: ");
				System.out.print(ListaTelefonos);
			} else {
				throw new IllegalArgumentException("Accion Incorrecta");
			}
			System.out.println();
		} while (respuesta == 0);

	}

}
