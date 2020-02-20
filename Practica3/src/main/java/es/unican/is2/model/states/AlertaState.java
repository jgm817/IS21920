package es.unican.is2.model.states;

import java.util.Timer;
import java.util.TimerTask;

import es.unican.is2.model.AlarmaHogar;

public class AlertaState extends StateAlarma {

	public AlertaTask alertaTask;
	public Timer timer;
	
	@Override
	public void alarmaOn(AlarmaHogar context) {
	}

	@Override
	public void alarmaOff(AlarmaHogar context, int codigoIntroduccido) {
		if(context.coincideCodigo(codigoIntroduccido)) {
			context.desactivarSensores();
			this.exitAction(context);
			timer.cancel();
			context.setState(apagada);
			apagada.entryAction(context);
		}
		
		if(!context.coincideCodigo(codigoIntroduccido)&& 
				context.getErrores()<3) {
			context.addError();
		}
		
		if(!context.coincideCodigo(codigoIntroduccido)&& context.getErrores()>=3) {
			context.resetErrores();
			timer.cancel();
			this.exitAction(context);
			context.setState(centralitaAvisada);
			centralitaAvisada.entryAction(context);
		}

	}

	@Override
	public void intruso(AlarmaHogar context) {}

	@Override
	public void off(AlarmaHogar context) {}

	@Override
	public void entryAction(AlarmaHogar context) {
		alertaTask = new AlertaTask(context);
		timer.schedule(alertaTask, 300000);

	}

	@Override
	public void exitAction(AlarmaHogar context) {}

	@Override
	public void doAction(AlarmaHogar context) {}

	public class AlertaTask extends TimerTask {

		private AlarmaHogar context;
		
		public AlertaTask(AlarmaHogar context) {
			this.context=context;
		}
		
		public void run() {
			context.setState(centralitaAvisada);
			centralitaAvisada.entryAction(context);
		}
		
	}
}
