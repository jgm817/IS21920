package es.unican.is2.model;

import es.unican.is2.model.states.StateAlarma;

public class AlarmaHogar {
	private int intervaloSalida;
	private int intervaloDesactivacion;
	private int codigoDesactivacion;
	private int errores;
	private StateAlarma state;
	
	public AlarmaHogar() {
		state = StateAlarma.init(this);
	}
	
	public void setState(StateAlarma valor) {
		state = valor;
	}
	
	public void notificarCentralita() {
		
	}
	
	public void desactivarSensores() {
		
	}
	
	public void activarSensores() {
		
	}
	
	public int getIntervaloSalida() {
		return intervaloSalida;
	}
	
	public int getIntervaloDesactivacion() {
		return intervaloDesactivacion;
	}
	
	public int getErrores() {
		return errores;
	}
	
	public void addError() {
		errores++;
	}
	
	public void resetErrores() {
		errores = 0;
	}
	
	public boolean coincideCodigo(int codigo) {
		return codigoDesactivacion == codigo;
	}
	
}
