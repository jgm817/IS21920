package es.unican.is2.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import es.unican.is2.model.Piloto;

import javax.swing.Action;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JEditorPane;

@SuppressWarnings("serial")
public class Alarma extends JFrame implements PropertyChangeListener{

	private JPanel PanelAlarma;
	private String codigo;
	private JButton botonAlarmaOn;
	private JButton botonAlarmaOff;
	private JEditorPane piloto;
	private Timer timer;
	private ParpadeandoTask parpadeando;


	public Alarma(Piloto p) {
		p.addPropertyChangeListener(this);
		codigo = "";
		init();
		timer = new Timer();
	}

	/**
	 * Create the frame.
	 */
	public void init() {
		setForeground(Color.BLACK);
		setFont(new Font("Tahoma", Font.PLAIN, 16));
		setTitle("Introduzca Código de la Alarma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		PanelAlarma = new JPanel();
		PanelAlarma.setForeground(Color.BLACK);
		PanelAlarma.setToolTipText("");
		PanelAlarma.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelAlarma);
		PanelAlarma.setLayout(null);

		JButton boton1 = new JButton("1");
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo+="1";
				System.out.println(codigo);

			}
		});
		boton1.setBounds(32, 43, 85, 80);
		PanelAlarma.add(boton1);

		JButton boton2 = new JButton("2");
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo+="2";
				System.out.println(codigo);
			}
		});
		boton2.setBounds(127, 43, 85, 80);
		PanelAlarma.add(boton2);

		JButton boton3 = new JButton("3");
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo+="3";
				System.out.println(codigo);

			}
		});
		boton3.setBounds(222, 43, 85, 80);
		PanelAlarma.add(boton3);

		JButton boton4 = new JButton("4");
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo+="4";
				System.out.println(codigo);

			}
		});
		boton4.setBounds(32, 133, 85, 80);
		PanelAlarma.add(boton4);

		JButton boton5 = new JButton("5");
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo+="5";
				System.out.println(codigo);

			}
		});
		boton5.setBounds(127, 133, 85, 80);
		PanelAlarma.add(boton5);

		JButton boton6 = new JButton("6");
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo+="6";
				System.out.println(codigo);
			}
		});
		boton6.setBounds(222, 133, 85, 80);
		PanelAlarma.add(boton6);

		JButton boton7 = new JButton("7");
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo+="7";
				System.out.println(codigo);
			}
		});
		boton7.setBounds(32, 223, 85, 80);
		PanelAlarma.add(boton7);

		JButton boton8 = new JButton("8");
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo+="8";
				System.out.println(codigo);
			}
		});
		boton8.setBounds(127, 223, 85, 80);
		PanelAlarma.add(boton8);

		JButton boton9 = new JButton("9");
		boton9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo+="9";
				System.out.println(codigo);
			}
		});
		boton9.setBounds(222, 223, 85, 80);
		PanelAlarma.add(boton9);

		botonAlarmaOn = new JButton("Alarma On");
		botonAlarmaOn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonAlarmaOn.setBounds(341, 199, 224, 40);
		PanelAlarma.add(botonAlarmaOn);

		botonAlarmaOff = new JButton("Alarma Off\r\n");
		botonAlarmaOff.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonAlarmaOff.setBounds(341, 249, 224, 40);
		PanelAlarma.add(botonAlarmaOff);


		piloto = new JEditorPane();
		piloto.setBackground(Color.GREEN);
		piloto.setVisible(false);
		piloto.setBounds(341, 43, 224, 81);
		PanelAlarma.add(piloto);

		JButton botonReseteo = new JButton("Resetear codigo");
		botonReseteo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonReseteo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				codigo="";
				System.out.println(codigo);

			}
		});
		botonReseteo.setBounds(341, 150, 224, 40);
		PanelAlarma.add(botonReseteo);
	}

	public void setAlarmaOnAction(Action action) {
		botonAlarmaOn.setAction(action);
	}

	public void setAlarmaOffAction(Action action) {
		botonAlarmaOff.setAction(action);
	}

	public void propertyChange(PropertyChangeEvent evt) {
		if(evt.getPropertyName().equals("pilotoOn")) {
			parpadeando.cancel();
			piloto.setVisible(true);
			piloto.setBackground(Color.GREEN);
		}else if(evt.getPropertyName().equals("pilotoOff")) {
			parpadeando.cancel();
			piloto.setVisible(false);
		}else if(evt.getPropertyName().equals("pilotoParpadeando")) {
			piloto.setBackground(Color.YELLOW);
			parpadeando = new ParpadeandoTask();
			timer.schedule(parpadeando, 0,1000);
		}
	}

	public String getCodigo() {
		return codigo;
	}

	public void resetCodigo() {
		codigo = "";
	}

	public class ParpadeandoTask extends TimerTask{
		@Override
		public void run() {
			try {
				piloto.setVisible(true);
				Thread.sleep(500);
				piloto.setVisible(false);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}



}
