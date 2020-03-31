package es.unican.is2.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.unican.is2.listaOrdenadaAcotada.ListaOrdenadaAcotada;


public class ListaTest {

	
	ListaOrdenadaAcotada<Integer> lista;
	
	@Before
	public void setUp() {
		try {
			lista = new ListaOrdenadaAcotada<Integer>(5);
		}catch(Exception e) {
			fail("");
		}
	}
	
	@Test 
	public void add() {
		ListaOrdenadaAcotada<Integer> listaMin=new ListaOrdenadaAcotada<Integer>(1);

		//CASO 1
		try {
			listaMin.add(5);
			assertTrue(listaMin.get(0)==5);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		//CASO 2
		try {
			lista.add(5);
			lista.add(3);
			assertTrue(lista.get(0)==3);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		
		//CASO 3 
		try {
			lista.add(4);
			assertTrue(lista.get(1)==4);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}

		lista.add(6);
		//CASO 4
		try {
			lista.add(-2);
			assertTrue(lista.get(0)==-2);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		
		//CASO 5
		try {
			lista=new ListaOrdenadaAcotada<Integer>(0);
			lista.add(5);
			fail("Debe lanzar excepcion");
		} catch (Exception e) {	
		}
		
		//CASO 6
		try {
			listaMin.add(5);
			fail("Debe lanzar excepcion");
		} catch (Exception e) {	
		}
		
		
	}
	
	@Test
	public void remove() {
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		int valorRetornado;
		//CASO 1
		try {
			valorRetornado = lista.remove(0);
			assertTrue(valorRetornado==1);
			assertTrue(lista.size()==4);

		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		//CASO 2
		try {
			valorRetornado = lista.remove(1);
			assertTrue(valorRetornado==3);
			assertTrue(lista.size()==3);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}

		
		//CASO 3
		try {
			valorRetornado = lista.remove(2);
			assertTrue(valorRetornado==5);
			assertTrue(lista.size()==2);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		lista.remove(1);
		//CASO 4
		try {
			valorRetornado = lista.remove(0);
			assertTrue(valorRetornado==2);
			assertTrue(lista.size()==0);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		
		//CASO 6
		try {
			lista.remove(0);
			fail("Debe lanzar excepcion");
		} catch (Exception e) {
		}
		

		lista.add(2);
		lista.add(4);
		//CASO 5
		try {
			lista.remove(-1);
			fail("Debe lanzar excepcion");
		} catch (Exception e) {
		}
		
		//CASO 13
		lista.add(3);
		lista.add(5);
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
		
		lista.remove(1);
		lista.remove(1);
		//CASO 18
		try {
			assertTrue(lista.get(0)==2);
		} catch (Exception e) {
			fail("No debe lanzar excepcion");
		}
		
		lista.remove(0);
		//CASO 19
		try {
			lista.get(0);
			fail("Debe lanzar error en get(0) cuando no lista vacia");
		} catch (Exception e) {
		}
		
		lista.add(2);
		lista.add(4);
		//CASO 20
		lista.clear();
		try {
			lista.get(4);
			fail("Deberia lanzar error en indice=long");
		} catch (Exception e) {
		}
		
		lista.add(3);
		lista.add(5);
		//CASO 20
		lista.clear();
		try {
			lista.get(8);
			fail("Deberia lanzar error en indice>long");
		} catch (Exception e) {
		}
		
		
	}
	
	@Test
	public void size() {
		//CASO 21
		try {
			assertTrue(lista.size()==0);
		} catch (Exception e) {
			fail("No debe lanzar error al capturar el tamaño de lista sin elementos");
		}
		
		
		lista.add(1);
		try {
			assertTrue(lista.size()==1);
			
		} catch (Exception e) {
			fail("No debe lanzar error al capturar el tamaño de lista con un elemento");
		}
		
		lista.add(2);
		lista.add(3);
		lista.add(4);
		//CASO 22
		try {
			assertTrue(lista.size()==4);
		} catch (Exception e) {
			fail("No debe lanzar error al capturar el tamaño de lista con varios elementos");

		}
		

	}
	
	@Test
	public void clear() {
		//Caso 2
		try {
			lista.clear();
			assertTrue(lista.size()==0);
		} catch (Exception e) {
			fail("No debe lanzar excepción al hacer un clear sin elementos");
		}
		
		//Caso 3
		lista.add(1);
		try {
			lista.clear();
			assertTrue(lista.size()==0);
		} catch (Exception e) {
			fail("No debe lanzar excepción al hacer un clear con un elemento");
		}
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		//Caso 1
		try {
			lista.clear();
			assertTrue(lista.size()==0);
		} catch (Exception e) {
			fail("No debe lanzar excepción al hacer un con varios elementos");
		}

	}

	
}
