package es.unican.is2.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import es.unican.is2.model.AlarmaHogar;
import es.unican.is2.view.SimuladorEventos;


@SuppressWarnings("serial")
public class OffAction extends AbstractAction {

	private SimuladorEventos vista;
	private AlarmaHogar modelo;
	
	public OffAction(AlarmaHogar model, SimuladorEventos view) {
		vista = view;
		modelo = model;
		putValue(Action.NAME, "Off");

	}


	public void actionPerformed(ActionEvent e) {
		modelo.off();;
	}
}
