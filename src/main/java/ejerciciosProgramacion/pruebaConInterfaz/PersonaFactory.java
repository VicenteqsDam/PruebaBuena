package ejerciciosProgramacion.pruebaConInterfaz;

public class PersonaFactory {

	public static Persona crearPersona(int i, String nombre, String ciudad, int edad) {
		if (i == 1) {
			return new Hombre(nombre,ciudad, edad);
		} else if (i == 2) {
			return new Mujer(nombre,ciudad, edad);
		}
		return null;
	}
}
