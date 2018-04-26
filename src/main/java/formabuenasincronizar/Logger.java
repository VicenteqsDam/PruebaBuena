package formabuenasincronizar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
	private BufferedWriter writer;

	public Logger() throws IOException {
		this.writer = new BufferedWriter(new FileWriter("log", true));
	}

	public void log(String mensaje) throws IOException {
		this.writer.append(mensaje + "\n");
	}

	public void closeWritter() throws IOException {
		this.writer.close();
	}
}
