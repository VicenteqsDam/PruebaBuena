package ejerciciosProgramacion.pruebaConInterfaz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		ArrayList<Persona> listado = new ArrayList<Persona>();
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
			Persona p = PersonaFactory.crearPersona(opcion, nombre, ciudad, edad);
			listado.add(p);
		} while (opcion != 3);
		scan.close();
		for (int i = 0; i < listado.size(); i++) {
			Persona o = listado.get(i);
			if (o.getEdad() > 18) {
				System.out.println(o.getNombre() + " Es mayor de 18");
			} else {
				System.out.println(o.getNombre() + " Es menor de 18");
			}
		}
	}

}
