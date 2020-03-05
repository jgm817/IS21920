package es.unican.is2.model;

import java.time.LocalDate;

public class Empleado {

	private Categoria tipoEmpleado;
	private String nombre;
	private LocalDate fechaContratacion;
	private boolean baja;
	
	public Empleado(Categoria tipoEmpleado, String nombre, LocalDate fechaContratacion) {
		this.tipoEmpleado=tipoEmpleado;
		this.nombre=nombre;
		this.fechaContratacion=fechaContratacion;
		this.baja=false;
	}
	
	public double sueldoBruto() {
		double sueldoFinal=0;
		switch(this.tipoEmpleado) {
		
		case OBRERO:
			sueldoFinal+=1000;
		case GESTOR:
			sueldoFinal+=1200;
		case DIRECTIVO:
			sueldoFinal+=1500;
		}
		
		
		if(fechaContratacion.minusYears(5).getYear()>0) {
			sueldoFinal+=50;
		}
		
		else if(fechaContratacion.minusYears(5).getYear()>0) {
			sueldoFinal+=100;

		}
		
		else if(fechaContratacion.minusYears(5).getYear()>0) {
			sueldoFinal+=200;

		}
		
		return sueldoFinal;
	}
	
	public void darDeAlta() {
		this.baja=false;
	}

	
	public void darDeBaja(){
		this.baja=true;
	}

	
	
}
