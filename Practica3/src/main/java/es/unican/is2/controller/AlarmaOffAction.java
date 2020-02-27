package es.unican.is2.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import es.unican.is2.model.AlarmaHogar;
import es.unican.is2.view.Alarma;

@SuppressWarnings("serial")
public class AlarmaOffAction extends AbstractAction {
	private Alarma vista;
	private AlarmaHogar modelo;
	
	public AlarmaOffAction(AlarmaHogar model, Alarma view) {
		vista = view;
		modelo = model;
		putValue(Action.NAME, "Alarma off");

	}


	public void actionPerformed(ActionEvent e) {
		String codigo = vista.getCodigo();
		modelo.alarmaOff(codigo);
		vista.resetCodigo();
	}
}