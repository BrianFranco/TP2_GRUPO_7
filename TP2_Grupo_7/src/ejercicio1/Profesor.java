package ejercicio1;

public class Profesor extends Empleado {
	
	//Attributes
	private String cargo;
	private int antiguedadDocente;
	
	//toString
	@Override
	public String toString() {
		return super.getId()+", "+ super.getNombre() + ", " + super.getEdad() + ", " + this.cargo+", " + this.antiguedadDocente;
	}
	
	//Getters and Setters
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}
	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}
	
	//Constructors
	Profesor(){
		super();
		this.cargo="";
		this.antiguedadDocente=0;
	}
	Profesor(String nombre,int edad,String cargo,int antiguedadDocente ){
		super(nombre,edad);
		this.cargo=cargo;
		this.antiguedadDocente=antiguedadDocente;
		
	}
}
