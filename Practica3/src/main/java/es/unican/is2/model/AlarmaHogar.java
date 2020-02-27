package es.unican.is2.model;

import es.unican.is2.model.states.StateAlarma;

public class AlarmaHogar {
	private int intervaloSalida;
	private int intervaloDesactivacion;
	private String codigoDesactivacion;
	private int errores;
	private Piloto piloto;
	private StateAlarma state;
	
	public AlarmaHogar(String pass, int intervaloSalida, int intervaloDesactivacion) {
		piloto = new Piloto();
		state = StateAlarma.init(this);
		errores = 0;
		codigoDesactivacion = pass;
		this.intervaloDesactivacion = intervaloDesactivacion;
		this.intervaloSalida = intervaloSalida;
	}
	
	public void setState(StateAlarma valor) {
		state = valor;
	}
	
	public StateAlarma getState() {
		return state;
	}
	
	public void alarmaOn() {
		state.alarmaOn(this);
	}
	
	public void alarmaOff(String codigo) {
		state.alarmaOff(this, codigo);
	}
	
	public void intruso() {
		state.intruso(this);
	}
	
	public void off() {
		state.off(this);
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
	
	public boolean coincideCodigo(String codigo) {
		return codigoDesactivacion.equals(codigo);
	}
	
	public Piloto getPiloto() {
		return piloto;
	}
}
