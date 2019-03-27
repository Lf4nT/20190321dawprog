package examen.ejercicio4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner ky = new Scanner(System.in);
		Map<String, String> agenda = new HashMap<String, String>();
		String nombre = " ";
		String telefono = " ";
		String Buscar = " ";
		String entrada = " ";
		int a = 1;
		int b = 0;

		do {
			System.out.println("Accion: ");
			entrada = ky.nextLine();
			Pattern patrontlfn = Pattern.compile("[a-zA-Z]+-[0-9]{9}");
			Pattern patronBuscar = Pattern.compile("[b][u][s][c][a][r]:[a-zA-Z]+");
			Pattern patronfin = Pattern.compile("[f][i][n]");
			Matcher fin = patronfin.matcher(entrada);
			Matcher mat = patrontlfn.matcher(entrada);
			Matcher matBuscar = patronBuscar.matcher(entrada);

			if (fin.matches()) {
				b = 1;
			} else {
				if (matBuscar.matches()) {
					for (int i = 0; i < entrada.length(); i++) {
						if (entrada.charAt(i) == ':') {
							for (int j = i + 1; j < entrada.length(); j++) {
								Buscar = Buscar + entrada.charAt(j);
							}
						}
					}
					if (agenda.get(Buscar) == " ") {
						System.out.println(Buscar + " no existe");
						Buscar = " ";
					} else {
						agenda.get(Buscar);
						Buscar = " ";
						System.out.println(agenda);
					}
				}

				if (mat.matches()) {
					for (int i = 0; i < entrada.length(); i++) {
						if (entrada.charAt(i) == '-') {
							for (int j = i + 1; j < entrada.length(); j++) {
								telefono = telefono + entrada.charAt(j);
								a = 0;
							}
						} else if (a != 0) {
							nombre = nombre + entrada.charAt(i);
						}
					}
					if (!agenda.containsKey(nombre)) {
						agenda.put(nombre, telefono);
					} else
						agenda.replace(nombre, telefono);
				} else if (!mat.matches() && !matBuscar.matches())
					System.out.println("Accion Incorrecta");
			}
		} while (b == 0);

		Iterator<String> iterator = agenda.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Nombre: " + key + " -> Tlf: " + agenda.get(key));
			ky.close();
		}
	}

}