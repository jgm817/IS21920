package es.unican.is2.model;

import es.unican.is2.model.states.StateAlarma;

public class AlarmaHogar {
	private int intervaloSalida;
	private int intervaloDesactivacion;
	private int codigoDesactivacion;
	private int errores;
	private Piloto piloto;
	private StateAlarma state;
	
	public AlarmaHogar(int pass, int intervaloSalida, int intervaloDesactivacion) {
		state = StateAlarma.init(this);
		piloto = new Piloto();
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
	
	public Piloto getPiloto() {
		return piloto;
	}
}
