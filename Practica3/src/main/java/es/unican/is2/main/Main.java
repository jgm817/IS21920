package es.unican.is2.main;

import es.unican.is2.controller.AlarmaOffAction;
import es.unican.is2.controller.AlarmaOnAction;
import es.unican.is2.controller.IntrusoAction;
import es.unican.is2.controller.OffAction;
import es.unican.is2.model.AlarmaHogar;
import es.unican.is2.view.Alarma;
import es.unican.is2.view.SimuladorEventos;

public class Main {

	public static void main(String[] args) {
		String codigo = "1234";
		int tiempoSalida = 5000;
		int tiempoDesactivacion =30000;
		AlarmaHogar modelo = new AlarmaHogar(codigo, tiempoSalida, tiempoDesactivacion);
		Alarma vista = new Alarma(modelo.getPiloto());
		SimuladorEventos vistaEventos = new SimuladorEventos();

		vista.setAlarmaOnAction(new AlarmaOnAction(modelo, vista));
		vista.setAlarmaOffAction(new AlarmaOffAction(modelo, vista));
		vistaEventos.setIntrusoAction(new IntrusoAction(modelo, vistaEventos));
		vistaEventos.setOffAction(new OffAction(modelo, vistaEventos));

		vistaEventos.setVisible(true);
		vista.setVisible(true);
	}

}
