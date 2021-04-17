package ejercicio3;

public class Edificio {
	
	enum tipoEdificio {
		POLIDEPORTIVO,
		OFICINA,
		}
	
	private double superficieM2;
	protected tipoEdificio tipo;
	
	public Edificio(double m2,tipoEdificio tipo) {
		superficieM2 = m2;
		this.tipo = tipo;
	}
	
	public double getSuperficieEdificio() {
		return superficieM2;
	}
	
	tipoEdificio getTipoDeInstalacion() {
		return tipo;
	}
}
