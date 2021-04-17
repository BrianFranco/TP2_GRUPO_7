package ejercicio3;

public class Polideportivo extends Edificio {

	private String nombre;
	public Polideportivo(double m2,tipoEdificio tipo,String nombre) {
		super(m2,tipo);
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Polideportivo [nombre=" + nombre + "]";
	}
	
	public tipoEdificio getTipoDeInstalacion() {
		return this.tipo;
	}
	
	
}
