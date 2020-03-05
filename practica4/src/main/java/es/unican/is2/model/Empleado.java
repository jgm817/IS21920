package es.unican.is2.model;

import java.util.Date;

public class Empleado {

	private Categoria tipoEmpleado;
	private String nombre;
	private Date fechaContratacion;
	private boolean baja;
	 
	public double sueldoBruto(Date antiguedad, boolean baja) {
		double sueldoFinal=0;
		
		
		return sueldoFinal;
	}
	
	public void darDeAlta() {
		this.baja=false;
	}

	
	public void darDeBaja(){
		this.baja=true;
	}

	
	
}
