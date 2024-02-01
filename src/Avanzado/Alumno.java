package Avanzado;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int telefono;
	private Asignatura[] asignaturas;
	private int contador;
	

	public Alumno(String nombre, String apellidos, int telefono) {
		asignaturas = new Asignatura[4];
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;

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
	
	public void add(Asignatura asignatura) {
		if(contador<asignaturas.length) {
			asignaturas[contador]=asignatura;
			contador++;
		}
		
	}

	@Override
	public String toString() {
		return nombre + "," + apellidos + "," + telefono;
	}

}

