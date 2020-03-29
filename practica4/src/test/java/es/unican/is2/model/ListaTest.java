package es.unican.is2.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.unican.is2.listaOrdenadaAcotada.ListaOrdenadaAcotada;


public class ListaTest {

	@Before
	public void setUp() {
		try {
			
		}catch(Exception e) {
			fail("");
		}
	}
	
	@Test 
	public void add() {
		ListaOrdenadaAcotada<Integer> lista=new ListaOrdenadaAcotada<Integer>(5);
		//CASO 1
		try {
			lista.add(5);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.get(0)==5);
		
		//CASO 2
		
		try {
			lista.add(3);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.get(0)==3);
		
		
		//CASO 3 
		try {
			lista.add(4);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.get(1)==4);
		
		//CASO 4
		try {
			lista.add(-2);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.get(0)==-2);
		
		//CASO 5
		lista=new ListaOrdenadaAcotada<Integer>(0);
		try {
			lista.add(5);
			fail("Debe lanzar excepcion");
		} catch (Exception e) {	
		}
		
		//CASO 6
		lista=new ListaOrdenadaAcotada<Integer>(1);
		try {
			lista.add(5);
			lista.add(5);
			fail("Debe lanzar excepcion");
		} catch (Exception e) {	
		}
		
		
	}
	
	@Test
	public void remove() {
		ListaOrdenadaAcotada<Integer> lista=new ListaOrdenadaAcotada<Integer>(6);
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		//CASO 7
		try {
			lista.remove(0);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.get(0)==2);
		
		//CASO 8
		try {
			lista.remove(1);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.get(0)==2);

		
		//CASO 9
		try {
			lista.remove(1);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.get(0)==2);
		
		//CASO 10
		try {
			lista.remove(0);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.get(0)==5);
		
		//CASO 11
		try {
			lista.remove(-1);
			fail("Debe lanzar excepcion");
		} catch (Exception e) {
		}
		
		//CASO 12
		lista.clear();
		try {
			lista.remove(0);
			fail("Debe lanzar excepcion");
		} catch (Exception e) {
		}
		
		//CASO 13
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		try {
			lista.remove(4);
			fail("Debe lanzar excepcion");
		} catch (Exception e) {
		}
		
		//CASO 14
		try {
			lista.remove(8);
			fail("Debe lanzar excepcion");
		} catch (Exception e) {
		}
		
		
	}
	
	@Test
	public void get() {
		ListaOrdenadaAcotada<Integer> lista=new ListaOrdenadaAcotada<Integer>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		//CASO 15
		try {
			assertTrue(lista.get(0)==1);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		
		//CASO 16
		lista.remove(0);
		lista.remove(3);
		try {
			assertTrue(lista.get(1)==3);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		//CASO 17
		try {
			assertTrue(lista.get(2)==4);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		//CASO 18
		try {
			assertTrue(lista.get(0)==2);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		//CASO 19
		try {
			lista.get(-1);
			fail("Indice erroneo");
		} catch (Exception e) {
		}
		
		//CASO 20
		lista.clear();
		try {
			lista.get(0);
			fail("La lista esta vacia, no debería poderse hacer operaciones");
		} catch (Exception e) {
		}
		
		
	}
	
	@Test
	public void size() {
		ListaOrdenadaAcotada<Integer> lista=new ListaOrdenadaAcotada<Integer>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		//CASO 21
		try {
			assertTrue(lista.size()==4);
		} catch (Exception e) {
			fail("El tamaño de la lista es incorrecto");
		}
		
		//CASO 22
		lista.clear();
		try {
			assertTrue(lista.size()==0);
		} catch (Exception e) {
			fail("Tamaño incorrecto");

		}
		
		//CASO 23
		lista.add(2);
		try {
			assertTrue(lista.size()==1);
			
		} catch (Exception e) {
			fail("Tamaño incorrecto");
		}

	}
	
	@Test
	public void clear() {
		ListaOrdenadaAcotada<Integer> lista=new ListaOrdenadaAcotada<Integer>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		//CASO 24
		try {
			lista.clear();
		} catch (Exception e) {
			fail("Tamaño incorrecto");
		}
		
		//CASO 25
		try {
			lista.clear();
			assertTrue(lista.size()==0);
		} catch (Exception e) {
			fail("Tamaño incorrecto");
		}
		
		//CASO 26
		lista.add(2);
		try {
			lista.clear();
			assertTrue(lista.size()==0);
		} catch (Exception e) {
			fail("Tamaño incorrecto");
		}

	}

	
}
