package ejercicio1;

public class Empleado {

	
//Attributes
	
    private final int id;
    private String nombre;
    private int edad;
    
    private static int numeroEmpleado = 999;
    
    
    //Constructors
    public Empleado() {
    	numeroEmpleado++;
    	this.id = numeroEmpleado;
    	this.nombre = "sin nombre";
    	this.edad = 99;
    }
    
    public Empleado(String nombre, int edad) {
    	numeroEmpleado++;
    	this.id = numeroEmpleado;
    	this.nombre = nombre;
    	this.edad = edad;
    }
    
    //Getters and Setters
    
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//toString
		@Override
		public String toString() {
			return "Empleado " + nombre + ", Edad: " + edad + ", Legajo: " + id;
		}
	//Method
	public static int devuelveProximoID() {
		return numeroEmpleado + 1;
	}
}
