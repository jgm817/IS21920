package es.unican.is2.model.states;

import es.unican.is2.model.AlarmaHogar;

public class EncendidaState extends StateAlarma {

	@Override
	public void alarmaOn(AlarmaHogar context) {}

	@Override
	public void alarmaOff(AlarmaHogar context, String codigoIntroduccido) {}

	@Override
	public void intruso(AlarmaHogar context) {
		exitAction(context);
		context.setState(alerta);
		alerta.entryAction(context);
		alerta.doAction(context);
	}

	@Override
	public void off(AlarmaHogar context) {}

	@Override
	public void entryAction(AlarmaHogar context) {
		context.getPiloto().encender();
	}

	@Override
	public void exitAction(AlarmaHogar context) {}

	@Override
	public void doAction(AlarmaHogar context) {}

}
