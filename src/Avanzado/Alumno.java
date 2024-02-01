package Avanzado;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int telefono;
	private double calificaciones[];
	

	public Alumno(int nota) {
		calificaciones = new double[nota];
		nombre = null;
		apellidos = null;
		telefono = 0;

	}

	public String getNombre() {
		return nombre;
	}

	public String apellidos() {
		return apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return nombre + "," + apellidos + "," + telefono + "," + calificaciones;
	}

}

