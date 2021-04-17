package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

import ejercicio3.Edificio.tipoEdificio;

public class Principal {


	public static void main(String[] args) {
		ArrayList<Edificio> edificios = new ArrayList<Edificio>();
		Polideportivo poli1 = new Polideportivo(220.00,tipoEdificio.POLIDEPORTIVO,"POLIDEPORTIVO N°14 EL ZORZAL");
		Polideportivo poli2 = new Polideportivo(260.50,tipoEdificio.POLIDEPORTIVO,"POLIDEPORTIVO N°2 SARMIENTO");
		Polideportivo poli3 = new Polideportivo(280.80,tipoEdificio.POLIDEPORTIVO,"POLIDEPORTIVO N°16 RICARDO GUTIÉRREZ");
		Oficina ofi1 = new Oficina(198.00,tipoEdificio.OFICINA,20,"Buena Vista");
		Oficina ofi2 = new Oficina(158.00,tipoEdificio.OFICINA,20,"Torre de las Naciones");
		edificios.add(poli1);
		edificios.add(poli2);
		edificios.add(poli3);
		edificios.add(ofi1);
		edificios.add(ofi2);
		
		Iterator<Edificio> it = edificios.iterator();
	    while(it.hasNext()) {
	     Edificio i = it.next();
	     if (i.getTipoDeInstalacion().equals(tipoEdificio.POLIDEPORTIVO)) {
			Polideportivo p = (Polideportivo) i;
			System.out.println(p);
		} else if(i.getTipoDeInstalacion().equals(tipoEdificio.OFICINA)) {
			Oficina o = (Oficina) i;
			System.out.println(o);
			}
	    }

	}

}
