package ejercicio2;

public class productoCongelado extends producto {
	private String temperaturaCongelacionRecomendada;
	
	public productoCongelado() {
		super();
		this.temperaturaCongelacionRecomendada = " ";
	}
	
	public productoCongelado(String fechaCaducidad, int numeroLote, String temperaturaCongelacionRecomendada) {
		super(fechaCaducidad, numeroLote);
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}

	public String getTemperaturaCongelacionRecomendada() {
		return temperaturaCongelacionRecomendada;
	}

	public void setTemperaturaCongelacionRecomendada(String temperaturaCongelacionRecomendada) {
		this.temperaturaCongelacionRecomendada = temperaturaCongelacionRecomendada;
	}

	@Override
	public String toString() {
		return super.toString()+" Producto Congelado: Temperatura de Congelacion Recomendada: " + temperaturaCongelacionRecomendada;
	}
	
	
}
