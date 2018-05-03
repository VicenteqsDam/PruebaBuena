package formabuenasincronizar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException, InterruptedException {
		String linea = null;
		File archivo = new File("C:\\archivo.txt");
		try (FileReader fr = new FileReader(archivo); BufferedReader br = new BufferedReader(fr)) {
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		}
	}

}
