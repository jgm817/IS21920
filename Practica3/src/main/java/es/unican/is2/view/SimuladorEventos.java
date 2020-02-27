package es.unican.is2.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SimuladorEventos extends JFrame {

	private JPanel contentPane;

	JButton botonOff;
	JButton botonIntruso;

	public SimuladorEventos() {
		init();
	}
	
	public void init() {
		setTitle("Simulador Eventos Casa Segura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		botonOff = new JButton("Off");
		botonOff.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonOff.setBounds(52, 42, 173, 68);
		contentPane.add(botonOff);
		
		botonIntruso = new JButton("Intruso");
		botonIntruso.setFont(new Font("Tahoma", Font.PLAIN, 24));
		botonIntruso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonIntruso.setBounds(282, 42, 173, 68);
		contentPane.add(botonIntruso);
	}
	
	public void setIntrusoAction(Action action) {
		botonIntruso.setAction(action);
	}
	
	public void setOffAction(Action action) {
		botonOff.setAction(action);
	}
}
