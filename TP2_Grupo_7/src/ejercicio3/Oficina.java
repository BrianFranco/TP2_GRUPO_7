package ejercicio3;

public class Oficina extends Edificio {

	private int cantEmpleados;
	private String nombre;
	
	public Oficina(double m2,tipoEdificio tipo,int nEmpleados,String n) {
		super(m2,tipo);
		cantEmpleados = nEmpleados;
		nombre = n;
		
	}

	public int getCantEmpleados() {
		return cantEmpleados;
	}

	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Oficina [nombre=" + nombre + "]";
	}
	
	public tipoEdificio getTipoDeInstalacion() {
		return this.tipo;
	}


}
