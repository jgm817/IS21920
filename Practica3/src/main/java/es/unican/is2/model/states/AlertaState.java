package es.unican.is2.model.states;

import java.util.Timer;
import java.util.TimerTask;

import es.unican.is2.model.AlarmaHogar;

public class AlertaState extends StateAlarma {

	
	public AlertaTask alertaTask;
	public Timer timer = new Timer();
	
	@Override
	public void alarmaOn(AlarmaHogar context) {
	}

	@Override
	public void alarmaOff(AlarmaHogar context, String codigoIntroduccido) {
		if(context.coincideCodigo(codigoIntroduccido)) {
			context.desactivarSensores();
			this.exitAction(context);
			alertaTask.cancel();
			context.setState(apagada);
			apagada.entryAction(context);
		}
		else if(!context.coincideCodigo(codigoIntroduccido)&& 
				context.getErrores()<2) {
			context.addError();
		}
		else if(!context.coincideCodigo(codigoIntroduccido)&& context.getErrores()>=2) {
			context.resetErrores();
			alertaTask.cancel();
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
		timer.schedule(alertaTask, context.getIntervaloDesactivacion());
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
			exitAction(context);
			context.setState(centralitaAvisada);
			centralitaAvisada.entryAction(context);
			centralitaAvisada.doAction(context);
		}
		
	}
}
