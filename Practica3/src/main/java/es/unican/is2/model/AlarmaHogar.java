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
	
	public boolean coincideCodigo(int codigo) {
		return codigoDesactivacion == codigo;
	}
	
}
