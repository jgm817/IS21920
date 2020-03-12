package es.unican.is2.model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Locale;

public class Empleado{

	private Categoria tipoEmpleado;
	private String nombre;
	private LocalDate fechaContratacion;
	private boolean baja;
	
	public class FechaIncorrectaException extends Exception{}
	
	public Empleado(Categoria tipoEmpleado, String nombre, LocalDate fechaContratacion) throws FechaIncorrectaException {
		this.tipoEmpleado=tipoEmpleado;
		if(tipoEmpleado==null) {
			throw new NullPointerException();
		}
		this.nombre=nombre;
		this.fechaContratacion=fechaContratacion;
		
		LocalDate today = LocalDate.now();
		if(fechaContratacion.isAfter(today)) {
			throw new FechaIncorrectaException();
		}
		
		if(fechaContratacion.equals(null)) {
			throw new NullPointerException();
		}
		
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
		
		else if(fechaContratacion.minusYears(10).getYear()>0) {
			sueldoFinal+=100;

		}
		
		else if(fechaContratacion.minusYears(20).getYear()>0) {
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
	
	public boolean estaEnBaja() {
		return baja;
	}

	
	
}
