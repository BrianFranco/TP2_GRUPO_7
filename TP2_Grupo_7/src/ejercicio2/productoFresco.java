package ejercicio2;

public class productoFresco extends producto {
	 private String fechaDeEnvasado;
	 private String paisDeOrigen;
	 
	 public productoFresco() {
			super();
			this.fechaDeEnvasado = " ";
			this.paisDeOrigen = " ";
	}
	 
	 public productoFresco(String fechaCaducidad, int numeroLote, String fechaDeEnvasado, String paisDeOrigen) {
		 super(fechaCaducidad, numeroLote);
		 this.fechaDeEnvasado = fechaDeEnvasado;
		 this.paisDeOrigen = paisDeOrigen;
	 }

	public String getFechaDeEnvasado() {
		return fechaDeEnvasado;
	}

	public void setFechaDeEnvasado(String fechaDeEnvasado) {
		this.fechaDeEnvasado = fechaDeEnvasado;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}

	@Override
	public String toString() {
		return super.toString()+" Producto Fresco: Fecha De Envasado: " + fechaDeEnvasado + ", Pais De Origen:" + paisDeOrigen;
	}
	 
	 
}
