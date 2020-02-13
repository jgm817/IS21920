package es.unican.is2.model;

public class Piloto {

	private EstadoPiloto estado;
	
	public EstadoPiloto estado() {
		return estado;
	}
	
	public void encender() {
		estado = EstadoPiloto.ENCENDIDO;
	}
	
	public void apagar() {
		estado = EstadoPiloto.APAGADO;
	}
	
	public void parpadear() {
		estado = EstadoPiloto.PARAPDEANDO;
	}
	
}
