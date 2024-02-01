package Avanzado;

public class Asignatura {
	
	private String nombre;
	private Asignatura []asignaturas;
	private Alumno calificaciones;
	
	public Asignatura() {
		nombre=null;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	
	public String toStrin() {
		return nombre;
	}

}

