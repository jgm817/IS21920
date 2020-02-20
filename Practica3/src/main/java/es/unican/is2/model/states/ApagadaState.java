package es.unican.is2.model.states;
import es.unican.is2.model.AlarmaHogar;

public class ApagadaState extends StateAlarma {

	@Override
	public void alarmaOn(AlarmaHogar context) {
		this.exitAction(context);
		context.setState(esperando);
		esperando.entryAction(context);
	}

	@Override
	public void alarmaOff(AlarmaHogar context, int codigoIntroduccido) {}

	@Override
	public void intruso(AlarmaHogar context) {}

	@Override
	public void off(AlarmaHogar context) {}

	@Override
	public void entryAction(AlarmaHogar context) {
		context.getPiloto().apagar();
	}

	@Override
	public void exitAction(AlarmaHogar context) {}

	@Override
	public void doAction(AlarmaHogar context) {}

}
