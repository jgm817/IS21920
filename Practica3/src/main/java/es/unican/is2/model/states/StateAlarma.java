package es.unican.is2.model.states;

import es.unican.is2.model.AlarmaHogar;

public abstract class StateAlarma {
	
	public void init(StateAlarma context) {
		//TODO
	}
	
	public abstract void alarmaOn(AlarmaHogar context);
	public abstract void alarmaOff(AlarmaHogar context, int codigoIntroduccido);
	public abstract void intruso(AlarmaHogar context);
	public abstract void off(AlarmaHogar context);
	
	public abstract void entryAction(AlarmaHogar context);
	public abstract void exitAction(AlarmaHogar context);
	public abstract void doAction(AlarmaHogar context);
	
}
