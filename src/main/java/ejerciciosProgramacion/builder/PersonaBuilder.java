package ejerciciosProgramacion.builder;

public class PersonaBuilder {
	private String colorOjos;
	private String colorPelo;
	private String tipoPelo;
	private String tipoOjos;
	private String nombre;
	private int edad;
	private String ciudad;
	private double peso;
	private double altura;
	
	public Persona contruir() {
		return new Persona(this);
	}
	
	public String getColorOjos() {
		return this.colorOjos;
	}
	
	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
	
	public String getColorPelo() {
		return this.colorPelo;
	}
	
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
	public String getTipoPelo() {
		return this.tipoPelo;
	}
	
	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}
	
	public String getTipoOjos() {
		return this.tipoOjos;
	}
	
	public void setTipoOjos(String tipoOjos) {
		this.tipoOjos = tipoOjos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
