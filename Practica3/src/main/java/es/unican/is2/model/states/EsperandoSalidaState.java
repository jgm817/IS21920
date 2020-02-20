package es.unican.is2.model.states;

import java.util.Timer;
import java.util.TimerTask;

import es.unican.is2.model.AlarmaHogar;

public class EsperandoSalidaState extends StateAlarma {

	private Timer timer = new Timer();
	private AlarmaSaliendoTask temporizador;
	
	@Override
	public void alarmaOn(AlarmaHogar context) {
		temporizador = new AlarmaSaliendoTask(context);
		timer.schedule(temporizador, context.getIntervaloSalida());
	}

	@Override
	public void alarmaOff(AlarmaHogar context, int codigoIntroduccido) {
		if(context.coincideCodigo(codigoIntroduccido)) {
			this.exitAction(context);
			
		}
	}

	@Override
	public void intruso(AlarmaHogar context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void off(AlarmaHogar context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void entryAction(AlarmaHogar context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exitAction(AlarmaHogar context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doAction(AlarmaHogar context) {
		// TODO Auto-generated method stub
		
	}
	
	public class AlarmaSaliendoTask extends TimerTask {

		private AlarmaHogar context;
		
		public AlarmaSaliendoTask(AlarmaHogar context) {
			this.context = context;
		}
		
		@Override
		public void run() {
			esperando.exitAction(context);
			context.setState(encendida);
			encendida.entryAction(context);
			encendida.doAction(context);
		}
		
	}
	
}

