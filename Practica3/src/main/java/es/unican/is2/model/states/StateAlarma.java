package es.unican.is2.model.states;

import es.unican.is2.model.AlarmaHogar;

public abstract class StateAlarma {
	
	private static ApagadaState apagada = new ApagadaState();
	private static EncendidaState encendida = new EncendidaState();
	private static AlertaState alerta = new AlertaState();
	private static CentralitaAvisadaState centralitaAvisada = new CentralitaAvisadaState();
	private static EsperandoSalidaState esperando = new EsperandoSalidaState();
	
	
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
