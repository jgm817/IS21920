package es.unican.is2.model.states;

import es.unican.is2.model.AlarmaHogar;

public class EncendidaState extends StateAlarma {

	@Override
	public void alarmaOn(AlarmaHogar context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alarmaOff(AlarmaHogar context, int codigoIntroduccido) {
		if(context.coincideCodigo(codigoIntroduccido)) {
			
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

}