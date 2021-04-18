package ejercicio2;

public class producto {
	private String fechaCaducidad;
	private int numeroLote;
	
	public producto () {
		this.fechaCaducidad = " ";
		this.numeroLote = 0;
	}
	
	public producto (String fechaCaducidad, int numeroLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	@Override
	public String toString() {
		return "Producto con Fecha de Caducidad: " + fechaCaducidad + ", Numero de Lote=" + numeroLote;
	}
	
	
}
