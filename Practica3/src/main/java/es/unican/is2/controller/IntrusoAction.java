package es.unican.is2.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import es.unican.is2.model.AlarmaHogar;
import es.unican.is2.view.Alarma;
import es.unican.is2.view.SimuladorEventos;

@SuppressWarnings("serial")
public class IntrusoAction extends AbstractAction {

	private SimuladorEventos vista;
	private AlarmaHogar modelo;
	
	public IntrusoAction(AlarmaHogar model, SimuladorEventos view) {
		vista = view;
		modelo = model;
		putValue(Action.NAME, "Intruso");

	}


	public void actionPerformed(ActionEvent e) {
		modelo.intruso();
	}
}
