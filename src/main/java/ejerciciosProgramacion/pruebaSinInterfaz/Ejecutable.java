package ejerciciosProgramacion.pruebaSinInterfaz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		ArrayList<Object> listado = new ArrayList<Object>();
		int opcion = 3;
		Scanner scan = new Scanner(System.in);
		String nombre;
		String ciudad;
		int edad;
		Hombre h;
		Mujer m;
		do {
			System.out.println("Introduce que quieres hacer");
			opcion = Integer.valueOf(scan.nextLine());
			System.out.println("Introduce el nombre");
			nombre = scan.nextLine();
			System.out.println("Introduce la ciudad");
			ciudad = scan.nextLine();
			System.out.println("Introduce la edad");
			edad = Integer.valueOf(scan.nextLine());
			if (opcion == 1) {
				h = new Hombre();
				h.setCiudad(ciudad);
				h.setEdad(edad);
				h.setNombre(nombre);
				listado.add(h);
			} else if (opcion == 2) {
				m = new Mujer();
				m.setCiudad(ciudad);
				m.setEdad(edad);
				m.setNombre(nombre);
				listado.add(m);
			}
		} while (opcion != 3);
		scan.close();
		for (int i= 0; i< listado.size();i++) {
			Object o = listado.get(i);
			if (o instanceof Hombre) {
				h = (Hombre)o;
				if (h.getEdad() > 18) {
					System.out.println(h.getNombre() + " Es mayor de 18");
				} else {
					System.out.println(h.getNombre() + " Es menor de 18");
				}
			} else {
				m = (Mujer) o;
				if (m.getEdad() > 18) {
					System.out.println(m.getNombre() + " Es mayor de 18");
				} else {
					System.out.println(m.getNombre() + " Es menor de 18");
				}
			}
		}
	}

}
