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
	
	//Genero los Métodos HashCode e Equals - Net
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
