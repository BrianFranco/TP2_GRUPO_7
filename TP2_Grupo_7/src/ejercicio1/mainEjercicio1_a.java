package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;



//Participantes: Brian Franco -

public class mainEjercicio1_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profesor [] vProfesores = new Profesor[5];
		vProfesores[0] = new Profesor("Juan",30,"Matematicas",5);
		vProfesores[1] = new Profesor();
		vProfesores[2] = new Profesor("Matu",40,"Literatura",5);
		vProfesores[3] = new Profesor();
		vProfesores[4] = new Profesor();
		vProfesores[4].setNombre("Maxi");
		vProfesores[4].setEdad(50);
		
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>(5);
		
		for (Profesor profesor : vProfesores) {
			listaProfesores.add(profesor);
		}	
		
		ListIterator<Profesor> lIterator = listaProfesores.listIterator();
		
		while(lIterator.hasNext()) {
			Profesor profesor = lIterator.next();
			System.out.println(profesor.toString());
		}
	}

}
