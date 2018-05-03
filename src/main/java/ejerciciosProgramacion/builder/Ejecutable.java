package ejerciciosProgramacion.builder;

public class Ejecutable {
	public static void main(String[] args) {
		PersonaBuilder perBuild = new PersonaBuilder();
		perBuild.setAltura(160);
		perBuild.setColorPelo("Rubio");
		Persona p = perBuild.contruir();
		perBuild.setAltura(190);
		Persona pAlto = perBuild.contruir();
	}
}
