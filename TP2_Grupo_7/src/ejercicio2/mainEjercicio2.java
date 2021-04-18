package ejercicio2;

public class mainEjercicio2 {

	public static void main(String[] args) {
		
		productoCongelado pCongelado = new productoCongelado();
		pCongelado.setFechaCaducidad("1/5/2025");
		pCongelado.setNumeroLote(56);
		pCongelado.setTemperaturaCongelacionRecomendada("5°");
		System.out.println(pCongelado.toString());
		
		productoFresco pFresco = new productoFresco();
		pFresco.setFechaCaducidad("5/9/2032");
		pFresco.setNumeroLote(39);
		pFresco.setFechaDeEnvasado("26/11/2020");
		pFresco.setPaisDeOrigen("Colombia");
		System.out.println(pFresco.toString());
		
		productoRefrigerado pRefrigerado = new productoRefrigerado();
		pRefrigerado.setFechaCaducidad("18/6/2023");
		pRefrigerado.setNumeroLote(12);
		pRefrigerado.setCodigoOrganismoSupervisionAlimentaria("69843");
		System.out.println(pRefrigerado.toString());
	}

}
