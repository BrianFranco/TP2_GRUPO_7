package ejercicio2;

public class productoRefrigerado extends producto {
	private String codigoOrganismoSupervisionAlimentaria;
	
	public productoRefrigerado() {
		super();
		this.codigoOrganismoSupervisionAlimentaria = " ";
	}
	
	public productoRefrigerado(String fechaCaducidad, int numeroLote, String codigoOrganismoSupervisionAlimentaria) {
		super(fechaCaducidad, numeroLote);
		this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
	}

	public String getCodigoOrganismoSupervisionAlimentaria() {
		return codigoOrganismoSupervisionAlimentaria;
	}

	public void setCodigoOrganismoSupervisionAlimentaria(String codigoOrganismoSupervisionAlimentaria) {
		this.codigoOrganismoSupervisionAlimentaria = codigoOrganismoSupervisionAlimentaria;
	}

	@Override
	public String toString() {
		return super.toString()+"productoRefrigerado [codigoOrganismoSupervisionAlimentaria=" + codigoOrganismoSupervisionAlimentaria
				+ "]";
	}
	
	
}
