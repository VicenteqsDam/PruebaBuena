package formabuenasincronizar;

import java.io.IOException;

public class Persona {
	private String frase;
	private Logger log;

	public Persona(String _frase) throws IOException, InterruptedException {
		this.frase = _frase;
		this.log = new Logger();
		Thread.sleep(1000);

	}

	public void decirFrase() throws IOException {
		System.out.println(this.frase);
		this.log.log(this.frase);
	}
	
	public void cerrarLog() throws IOException {
		this.log.closeWritter();
	}
}
