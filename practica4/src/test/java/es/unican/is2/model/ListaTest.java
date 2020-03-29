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
		ListaOrdenadaAcotada<Integer> lista=new ListaOrdenadaAcotada<Integer>();
		//CASO 1
		try {
			lista.add(3);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.get(0)==3);
		
		
		//CASO 2
		try {
			lista.add(1);
			lista.add(2);
			lista.add(3);
			
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.size()==3);
		
		//CASO 3 (ERROR)
		try {
			lista.add(null);
			fail("No debería aceptarse el tipo de datos null");
		}catch(Exception e) {

		}
	}
	
	@Test
	public void remove() {
		ListaOrdenadaAcotada<Integer> lista=new ListaOrdenadaAcotada<Integer>();
		ListaOrdenadaAcotada<Integer> listaNull=null;
		lista.add(3);
		
		//CASO 4
		try {
			lista.remove(0);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.size()==0);
		
		//CASO 5 (ERROR)
		try {
			lista.remove(-5);
			fail("El indice no puede ser negativo");
		} catch (Exception e) {
		}
		
		//CASO 6 (ERROR)
		try {
			lista.remove(3);
			fail("El indice no puede superar el numero de elementos");
		} catch (Exception e) {
		}
		
		//CASO 7
		lista.add(3);
		lista.add(4);
		lista.add(5);;
		try {
			assertTrue(lista.size()==3);
			lista.remove(0);
			assertTrue(lista.size()==2);
			lista.remove(0);
			assertTrue(lista.size()==1);
			lista.remove(0);
			assertTrue(lista.size()==0);
		} catch (Exception e) {
			fail("El tamaño no es correcto");
		}
		
		//CASO 8 (ERROR)
		try {
			lista.remove(0);
			fail("La lista no deberia tener elementos");
		} catch (Exception e) {
		}
		
		//CASO 9 (ERROR)
		try {
			listaNull.remove(0);
			fail("La lista esta a null, no debería poderse hacer operaciones");
		} catch (Exception e) {
		}
		
		
	}
	
	@Test
	public void get() {
		ListaOrdenadaAcotada<Integer> lista=new ListaOrdenadaAcotada<Integer>();
		ListaOrdenadaAcotada<Integer> listaNull=null;
		lista.add(3);
		
		//CASO 10
		try {
			lista.get(0);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		assertTrue(lista.size()==1);
		
		//CASO 11 (ERROR)
		try {
			lista.get(-5);
			fail("El indice no puede ser negativo");
		} catch (Exception e) {
		}
		
		//CASO 12 (ERROR)
		try {
			lista.get(3);
			fail("El indice no puede superar el numero de elementos");
		} catch (Exception e) {
		}
		
		
		//CASO 13
		try {
			lista.add(1);
			lista.add(2);
			lista.add(3);
			assertTrue(lista.size()==3);
			lista.get(0);
			lista.remove(0);
			assertTrue(lista.size()==2);
			lista.get(0);
			lista.remove(0);
			assertTrue(lista.size()==1);
			lista.get(0);
			lista.remove(0);
			assertTrue(lista.size()==0);
		} catch (Exception e) {
			fail("El tamaño no es correcto");
		}
		
		//CASO 14 (ERROR)
		try {
			lista.get(0);
			fail("La lista no deberia tener elementos");
		} catch (Exception e) {
		}
		
		//CASO 15 (ERROR)
		try {
			listaNull.get(0);
			fail("La lista esta a null, no debería poderse hacer operaciones");
		} catch (Exception e) {
		}
		
		
	}
	
	@Test
	public void size() {
		ListaOrdenadaAcotada<Integer> lista=new ListaOrdenadaAcotada<Integer>();
		ListaOrdenadaAcotada<Integer> listaNull=null;
		
		//CASO 16
		try {
			lista.add(3);
			lista.add(1);
			lista.add(4);
		} catch (Exception e) {
			fail("El tamaño de la lista es incorrecto");
		}
		assertTrue(lista.size()==3);
		
		//CASO 17 (ERROR)
		try {
			listaNull.get(0);
			fail("La lista esta a null, no debería poderse hacer operaciones");
		} catch (Exception e) {
		}

	}
	
	@Test
	public void clear() {
		ListaOrdenadaAcotada<Integer> lista=new ListaOrdenadaAcotada<Integer>();
		ListaOrdenadaAcotada<Integer> listaNull=null;
		
		//CASO 18
		
		try {
			lista.add(5);
			lista.add(4);
			lista.add(3);
			lista.add(2);
			lista.add(1);
			lista.clear();
		} catch (Exception e) {
			e.printStackTrace();
			fail("Error registrado cuando no debería haberlo");	
		}
		assertTrue(lista.size()==0);
		
		//CASO 19 (ERROR)
		try {
			listaNull.get(0);
			fail("La lista esta a null, no debería poderse hacer operaciones");
		} catch (Exception e) {
		}

	}

	
}
