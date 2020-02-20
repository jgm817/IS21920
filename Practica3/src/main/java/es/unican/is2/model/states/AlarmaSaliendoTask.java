package es.unican.is2.model.states;

import java.util.TimerTask;

import es.unican.is2.model.AlarmaHogar;

public class AlarmaSaliendoTask extends TimerTask {

	private AlarmaHogar context;
	
	public AlarmaSaliendoTask(AlarmaHogar context) {
		this.context = context;
	}
	
	@Override
	public void run() {
		
	}
	
}
