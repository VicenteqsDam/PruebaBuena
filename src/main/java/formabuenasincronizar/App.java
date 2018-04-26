package formabuenasincronizar;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException, InterruptedException {
		Persona p1 = new Persona("frase chula");
		Persona p2 = new Persona("frase mas chula");
		Persona p3 = new Persona("frase aun mas chula");
		p1.decirFrase();
		p1.decirFrase();
		p2.decirFrase();
		p3.decirFrase();
		p2.decirFrase();
		p3.decirFrase();
		p1.cerrarLog();
		p2.cerrarLog();
		p3.cerrarLog();
	}

}
