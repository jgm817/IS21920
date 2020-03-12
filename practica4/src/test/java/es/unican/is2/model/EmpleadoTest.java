package es.unican.is2.model;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import es.unican.is2.model.Categoria;
import es.unican.is2.model.Empleado;
import es.unican.is2.model.Empleado.DatoIncorrectoException;

public class EmpleadoTest {

	private Empleado sut;

	private LocalDate today = LocalDate.now();

	@Before
	public void setUp() {
		try {

		}catch(Exception e) {
			fail("Un empleado no ha podido ser creado");
		}
	}

	@Test
	public void constructorTest() {
		//TEST 1
		try {
			sut = new Empleado(Categoria.DIRECTIVO,"Pepe",today);
		}catch (Exception e) {
			fail("Se ha lanzado error en el constructor con datos correctos");
		}
		
		// CASO ERROR 11
		try {
			sut = new Empleado(Categoria.CONSERJE,"Pepe",today);
			fail("No se ha ejecutado el catch con un cargo erroneo");
		}catch(DatoIncorrectoException e) {

		}

		// CASO ERROR  12
		try {
			sut = new Empleado(null,"Pepe",today);
			fail("No se ha ejecutado el catch con un cargo nulo");
		}catch(NullPointerException e) {

		}catch(DatoIncorrectoException e) {
			fail("No debe dar un cargo incorrecto");
		}

		// CASO ERROR 13
		try {
			sut = new Empleado(Categoria.DIRECTIVO,"Pepe",today.plusYears(1));
			fail("No se ha ejecutado el catch con una contratacion futura");
		}catch(Exception e) {

		}

		//CASO ERROR 14
		try {
			sut = new Empleado(Categoria.DIRECTIVO,"Pepe",null);
			fail("No se ha ejecutado el catch con una fecha nula");
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Test 
	public void darDeBaja() {
		// CASO 1
		try {
			sut = new Empleado(Categoria.DIRECTIVO,"Pepe",today);
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");
		}
		sut.darDeBaja();
		assertTrue(sut.estaEnBaja());
	}

	@Test 
	public void darDeAlta() {
		try {
			sut = new Empleado(Categoria.DIRECTIVO,"Pepe",today);
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");
		}
		sut.darDeBaja();
		sut.darDeAlta();
		assertFalse(sut.estaEnBaja());
	}

	@Test
	public void testSueldoBruto() {
		//CASO 1
		try {
			sut = new Empleado(Categoria.DIRECTIVO,"Pepe",today);
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");
		}
		sut.darDeBaja();
		assertTrue(sut.sueldoBruto()==1125);

		//CASO 2
		try {
			sut = new Empleado(Categoria.GESTOR,"Pepe",today.minusYears(3));
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");

		}
		assertTrue(sut.sueldoBruto()==1200);

		//CASO 3
		try {
			sut = new Empleado(Categoria.OBRERO,"Pepe",today.minusYears(5));
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");

		}
		sut.darDeBaja();
		assertTrue(sut.sueldoBruto()==750);

		//CASO 4
		try {
			sut = new Empleado(Categoria.DIRECTIVO,"Pepe",today.minusYears(6));
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");

		}
		assertTrue(sut.sueldoBruto()==1550);

		//CASO 5
		try {
			sut = new Empleado(Categoria.GESTOR,"Pepe",today.minusYears(8));
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");

		}
		sut.darDeBaja();
		assertTrue(sut.sueldoBruto()==937.5);

		//CASO 6
		try {
			sut = new Empleado(Categoria.OBRERO,"Pepe",today.minusYears(10));
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");

		}
		assertTrue(sut.sueldoBruto()==1050);

		//CASO 7
		try {
			sut = new Empleado(Categoria.DIRECTIVO,"Pepe",today.minusYears(11));
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");

		}
		sut.darDeBaja();
		assertTrue(sut.sueldoBruto()==1200);

		//CASO 8
		try {
			sut = new Empleado(Categoria.GESTOR,"Pepe",today.minusYears(15));
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");

		}
		assertTrue(sut.sueldoBruto()==1300);

		//CASO 9
		try {
			sut = new Empleado(Categoria.OBRERO,"Pepe",today.minusYears(20));
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");

		}
		sut.darDeBaja();
		assertTrue(sut.sueldoBruto()==825);

		//CASO 10
		try {
			sut = new Empleado(Categoria.DIRECTIVO,"Pepe",today.minusYears(30));
		} catch (DatoIncorrectoException e) {
			fail("No debe lanzar excepcion");

		}
		assertTrue(sut.sueldoBruto()==1700);
		
	}
}
