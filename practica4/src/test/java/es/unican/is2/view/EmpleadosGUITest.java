package es.unican.is2.view;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.fest.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmpleadosGUITest {

	private FrameFixture demo;
	private LocalDate today;
	
	
	@Before
	public void hey() {
		EmpleadosGUI gui = new EmpleadosGUI();
		gui.setVisible(true);
		demo = new FrameFixture(gui);
		today = LocalDate.now();
	}
	
	@After
	public void clear() {
		demo.cleanUp();
	}

	@Test
	public void test() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		demo.textBox("txtFechaContratacion").setText(today.minusYears(3).format(formatter));
		demo.comboBox("comboCategoria").selectItem("GESTOR");
		demo.button("btnCalcular").click();
		demo.textBox("txtSueldo").requireText("1200.0");
		
		demo.textBox("txtFechaContratacion").setText(today.format(formatter));
		demo.comboBox("comboCategoria").selectItem("DIRECTIVO");
		demo.radioButton("btnVIP").check();
		demo.button("btnCalcular").click();
		demo.textBox("txtSueldo").requireText("1125.0");
		
		demo.textBox("txtFechaContratacion").setText(today.minusYears(20).format(formatter));
		demo.comboBox("comboCategoria").selectItem("OBRERO");
		demo.radioButton("btnVIP").check();
		demo.button("btnCalcular").click();
		demo.textBox("txtSueldo").requireText("825.0");
		
		demo.textBox("txtFechaContratacion").setText(today.plusYears(1).format(formatter));
		demo.comboBox("comboCategoria").selectItem("DIRECTIVO");
		demo.radioButton("btnVIP").check();
		demo.button("btnCalcular").click();
		demo.textBox("txtSueldo").requireText("-1.0");
		
		demo.textBox("txtFechaContratacion").setText("21-3-2011");
		demo.comboBox("comboCategoria").selectItem("DIRECTIVO");
		demo.radioButton("btnVIP").check();
		demo.button("btnCalcular").click();
		demo.textBox("txtSueldo").requireText("Formato fecha incorrecto");
	}
}
