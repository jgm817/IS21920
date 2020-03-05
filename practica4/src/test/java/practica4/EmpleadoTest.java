package practica4;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import es.unican.is2.model.Categoria;
import es.unican.is2.model.Empleado;

public class EmpleadoTest {

	private Empleado empleado1;
	private Empleado empleado2;
	private Empleado empleado3;
	private Empleado empleado4;
	private Empleado empleado5;
	private Empleado empleado6;
	private Empleado empleado7;
	private Empleado empleado8;
	private Empleado empleado9;
	private Empleado empleado10;
	private Empleado empleadoA;
	
	private LocalDate today = LocalDate.now();
	
	@Before
	public void setUp() {
		try {
			empleado1 = new Empleado(Categoria.DIRECTIVO,"Empleado 1",today);
			empleado2 = new Empleado(Categoria.GESTOR,"Empleado 2",today.minusYears(3));
			empleado3 = new Empleado(Categoria.OBRERO,"Empleado 3",today.minusYears(5));
			empleado4 = new Empleado(Categoria.DIRECTIVO,"Empleado 4",today.minusYears(6));
			empleado5 = new Empleado(Categoria.GESTOR,"Empleado 5",today.minusYears(8));
			empleado6 = new Empleado(Categoria.OBRERO,"Empleado 6",today.minusYears(10));
			empleado7 = new Empleado(Categoria.DIRECTIVO,"Empleado 7",today.minusYears(11));
			empleado8 = new Empleado(Categoria.GESTOR,"Empleado 8",today.minusYears(15));
			empleado9 = new Empleado(Categoria.OBRERO,"Empleado 9",today.minusYears(20));
			empleado10 = new Empleado(Categoria.DIRECTIVO,"Empleado 10",today.minusYears(30));
		}catch(Exception e) {
			fail("Un empleado no ha podido ser creado");
		}
	}
	
	@Test void darDeBaja() {
		empleado1.darDeBaja();
		assertTrue(empleado1.estaEnBaja());
	}
	
	@Test void darDeAlta() {
		empleado1.darDeBaja();
		empleado1.darDeAlta();
		assertFalse(empleado1.estaEnBaja());
	}
	
	@Test
	public void testSueldoBruto() {
		empleado1.darDeBaja();
		empleado3.darDeBaja();
		empleado5.darDeBaja();
		empleado7.darDeBaja();
		empleado9.darDeBaja();	
		assertTrue(empleado1.sueldoBruto()==1125);
		assertTrue(empleado2.sueldoBruto()==1200);
		assertTrue(empleado3.sueldoBruto()==750);
		assertTrue(empleado4.sueldoBruto()==1550);
		assertTrue(empleado5.sueldoBruto()==937.5);
		assertTrue(empleado6.sueldoBruto()==1050);
		assertTrue(empleado7.sueldoBruto()==1200);
		assertTrue(empleado8.sueldoBruto()==1300);
		assertTrue(empleado9.sueldoBruto()==825);
		assertTrue(empleado10.sueldoBruto()==1700);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
