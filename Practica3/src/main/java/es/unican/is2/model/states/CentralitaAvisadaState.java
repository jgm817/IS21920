package es.unican.is2.model.states;

import es.unican.is2.model.AlarmaHogar;

public class CentralitaAvisadaState extends StateAlarma {

	@Override
	public void alarmaOn(AlarmaHogar context) {

	}

	@Override
	public void alarmaOff(AlarmaHogar context, String codigoIntroduccido) {
		
	}

	@Override
	public void intruso(AlarmaHogar context) {

	}

	@Override
	public void off(AlarmaHogar context) {
		this.exitAction(context);
		context.desactivarSensores();
		context.setState(apagada);
		apagada.entryAction(context);
	}

	@Override
	public void entryAction(AlarmaHogar context) {
		System.out.println("Centralita avisada");
	}

	@Override
	public void exitAction(AlarmaHogar context) {

	}

	@Override
	public void doAction(AlarmaHogar context) {

	}

}
