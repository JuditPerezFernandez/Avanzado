package Avanzado;

public class Start {

	public static void main(String[] args) {
		Aula aula1=new Aula();
		Alumno alumno1=new Alumno("Juan","Fernández",123456789);
		Asignatura asignatura1=new Asignatura("Lengua",8,4,9);
		alumno1.add(asignatura1);
		aula1.add(alumno1);

	}

}
