package es.unican.is2.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import es.unican.is2.model.AlarmaHogar;
import es.unican.is2.view.Alarma;

@SuppressWarnings("serial")
public class AlarmaOnAction extends AbstractAction {
	private Alarma vista;
	private AlarmaHogar modelo;
	
	public AlarmaOnAction(AlarmaHogar model, Alarma view) {
		vista = view;
		modelo = model;
		putValue(Action.NAME, "Alarma on");
	}


	public void actionPerformed(ActionEvent e) {
		modelo.alarmaOn();
		vista.resetCodigo();
	}
}