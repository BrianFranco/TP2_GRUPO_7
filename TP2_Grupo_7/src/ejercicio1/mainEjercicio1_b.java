package ejercicio1;

//Nethzer Carpio

import java.util.Iterator;

import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		
		
		Profesor p1 = new Profesor("Mary", 45, "Docente", 10);
		Profesor p2 = new Profesor("Alex", 30, "Docente", 12);
		Profesor p3 = new Profesor("Juan", 26, "Docente", 1);
		Profesor p4 = new Profesor("Dina", 29, "Docente", 5);
		Profesor p5 = new Profesor("Caro", 31, "Docente", 4);
		
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);				
				
		Iterator<Profesor> it = listaProfesores.iterator();
		while (it.hasNext()) {
			Profesor profesor = it.next();
			//it.remove();
			System.out.println(profesor.toString());
		}
		
		Profesor x = new Profesor("Tomy", 55, "Docente", 20);
		//System.out.println(x.hashCode());
		Profesor y = new Profesor("Tomy", 55, "Docente", 20);
		//System.out.println(y.hashCode());
		
		if(x.hashCode()==y.hashCode()) {
			System.out.println("Es el mismo Profesor");
		}

	}

}
