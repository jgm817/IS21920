package es.unican.is2.model;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Locale;

public class Empleado{

	private Categoria tipoEmpleado;
	private String nombre;
	private LocalDate fechaContratacion;
	private boolean baja;
	private LocalDate today;

	public class DatoIncorrectoException extends Exception{}

	public Empleado(Categoria tipoEmpleado, String nombre, LocalDate fechaContratacion) throws DatoIncorrectoException {
		this.tipoEmpleado=tipoEmpleado;
		if(tipoEmpleado==null) {
			throw new NullPointerException();
		} else if(tipoEmpleado!=Categoria.DIRECTIVO&&tipoEmpleado!=Categoria.GESTOR&&tipoEmpleado!=Categoria.OBRERO) {
			throw new DatoIncorrectoException();
		}
		this.nombre=nombre;
		this.fechaContratacion=fechaContratacion;

		today = LocalDate.now();
		if(fechaContratacion==null) {
			throw new NullPointerException();
		}

		if(fechaContratacion.isAfter(today)) {
			throw new DatoIncorrectoException();
		}



		this.baja=false;


	}

	public double sueldoBruto() {
		double sueldoFinal=0;
		switch(this.tipoEmpleado) {
			case OBRERO:
				sueldoFinal+=1000;
				break;
			case GESTOR:
				sueldoFinal+=1200;
				break;
			case DIRECTIVO:
				sueldoFinal+=1500;
				break;
		}


		if(fechaContratacion.isBefore(today.minusYears(20))) {
			sueldoFinal+=200;
		}

		else if(fechaContratacion.isBefore(today.minusYears(10))) {
			sueldoFinal+=100;
		}

		else if(fechaContratacion.isBefore(today.minusYears(5))) {
			sueldoFinal+=50;
		}
		
		if(baja) {
			sueldoFinal*=0.75;
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
