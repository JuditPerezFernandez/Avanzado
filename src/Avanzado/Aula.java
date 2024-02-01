package Avanzado;

import java.util.Arrays;

public class Aula {

	
	private Alumno[] alumnos;
	private int contador;
	
	public Aula() {
		alumnos=new Alumno[5];
	}
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}
	public void add(Alumno alumno) {
		if(contador<alumnos.length) {
			alumnos[contador]= alumno;
		}
		
		
	}
	
	
	
	@Override
	public String toString() {
		return "Aula [alumnos=" + Arrays.toString(alumnos) + "]";
	}


	
	
	
	
	
}
