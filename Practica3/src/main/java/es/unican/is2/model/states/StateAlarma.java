package es.unican.is2.model.states;

public abstract class StateAlarma {
	
	public abstract void alarmaOn();
	public abstract void alarmaOff(int codigoIntroduccido);
	public abstract void intruso();
	public abstract void off();
	
	public abstract void entryAction();
	public abstract void exitAction();
	public abstract void doAction();
	
}
