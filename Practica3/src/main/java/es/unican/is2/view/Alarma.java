package es.unican.is2.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JEditorPane;

public class Alarma extends JFrame {

	private JPanel PanelAlarma;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alarma frame = new Alarma();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Alarma() {
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
			}
		});
		boton1.setBounds(32, 43, 85, 80);
		PanelAlarma.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton2.setBounds(127, 43, 85, 80);
		PanelAlarma.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton3.setBounds(222, 43, 85, 80);
		PanelAlarma.add(boton3);
		
		JButton boton4 = new JButton("4");
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton4.setBounds(32, 133, 85, 80);
		PanelAlarma.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton5.setBounds(127, 133, 85, 80);
		PanelAlarma.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton6.setBounds(222, 133, 85, 80);
		PanelAlarma.add(boton6);
		
		JButton boton7 = new JButton("7");
		boton7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton7.setBounds(32, 223, 85, 80);
		PanelAlarma.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton8.setBounds(127, 223, 85, 80);
		PanelAlarma.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setFont(new Font("Tahoma", Font.PLAIN, 24));
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		boton9.setBounds(222, 223, 85, 80);
		PanelAlarma.add(boton9);
		
		JButton botonAlarmaOn = new JButton("Alarma On");
		botonAlarmaOn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonAlarmaOn.setBounds(341, 199, 224, 40);
		PanelAlarma.add(botonAlarmaOn);
		
		JButton botonAlarmaOff = new JButton("Alarma Off\r\n");
		botonAlarmaOff.setFont(new Font("Tahoma", Font.PLAIN, 20));
		botonAlarmaOff.setBounds(341, 249, 224, 40);
		PanelAlarma.add(botonAlarmaOff);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setBounds(411, 63, 85, 40);
		PanelAlarma.add(lblNewLabel);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.GREEN);
		editorPane.setBounds(341, 43, 224, 81);
		PanelAlarma.add(editorPane);
	}
}
