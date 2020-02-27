package es.unican.is2.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Piloto {

	private EstadoPiloto estado;
	private PropertyChangeSupport changeSupp;

	public Piloto() {
		changeSupp = new PropertyChangeSupport(this);
	}
	
	public EstadoPiloto estado() {
		return estado;
	}
	
	public void encender() {
		changeSupp.firePropertyChange("pilotoOn", estado, EstadoPiloto.ENCENDIDO);
		estado = EstadoPiloto.ENCENDIDO;
	}
	
	public void apagar() {
		changeSupp.firePropertyChange("pilotoOff", estado, EstadoPiloto.APAGADO);
		estado = EstadoPiloto.APAGADO;
	}
	
	public void parpadear() {
		changeSupp.firePropertyChange("pilotoParpadeando", estado, EstadoPiloto.PARPADEANDO);
		estado = EstadoPiloto.PARPADEANDO;
	}
	
	public void addPropertyChangeListener (PropertyChangeListener listener)
	{
		changeSupp.addPropertyChangeListener(listener);
	}

}
