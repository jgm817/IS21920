package es.unican.is2.model.states;

import es.unican.is2.model.AlarmaHogar;

public abstract class StateAlarma {
	
	protected static ApagadaState apagada = new ApagadaState();
	protected static EncendidaState encendida = new EncendidaState();
	protected static AlertaState alerta = new AlertaState();
	protected static CentralitaAvisadaState centralitaAvisada = new CentralitaAvisadaState();
	protected static EsperandoSalidaState esperando = new EsperandoSalidaState();
	
	
	public static StateAlarma init(AlarmaHogar context) {
		apagada.entryAction(context);
		return apagada;
	}
	
	public abstract void alarmaOn(AlarmaHogar context);
	public abstract void alarmaOff(AlarmaHogar context, int codigoIntroduccido);
	public abstract void intruso(AlarmaHogar context);
	public abstract void off(AlarmaHogar context);
	
	public abstract void entryAction(AlarmaHogar context);
	public abstract void exitAction(AlarmaHogar context);
	public abstract void doAction(AlarmaHogar context);
	
}
