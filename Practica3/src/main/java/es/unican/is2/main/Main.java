package es.unican.is2.main;

import es.unican.is2.controller.AlarmaOffAction;
import es.unican.is2.controller.AlarmaOnAction;
import es.unican.is2.model.AlarmaHogar;
import es.unican.is2.view.Alarma;

public class Main {

	public static void main(String[] args) {
		AlarmaHogar modelo = new AlarmaHogar("1234", 5000, 5000);
		Alarma vista = new Alarma(modelo.getPiloto());
		vista.setAlarmaOnAction(new AlarmaOnAction(modelo, vista));
		vista.setAlarmaOffAction(new AlarmaOffAction(modelo, vista));
		vista.setVisible(true);

	}

}
