package ejerciciosProgramacion;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class Pila implements ColeccionInterfaz {

	private Object[] lista;
	private int contador;

	public Pila(int tamMax) {
		this.lista = new Object[tamMax];
		this.contador = 0;
	}

	public boolean estaVacia() {
		boolean salida = false;
		if (this.contador == 0) {
			salida = true;
		}
		return salida;
	}

	public Object extraer() {
		if (this.estaVacia()) {
			throw new NoSuchElementException();
		}
		this.contador--;
		return this.lista[this.contador];
	}

	public Object primero() throws NoSuchElementException {
		if (this.estaVacia()) {
			throw new NoSuchElementException();
		}
		return this.lista[this.contador - 1];
	}

	public boolean anadir(Object objeto) {
		boolean salida = false;
		if (Array.getLength(this.lista) > this.contador) {
			this.lista[this.contador] = objeto;
			this.contador++;
			salida = true;
		}
		return salida;
	}

	@Override
	public String toString() {
		String salida = "";
		for (int i = 0; i < this.contador; i++) {
			salida += "Posición: " + i + " Valor: " + this.lista[i] + "\n";
		}
		return salida;
	}
}
