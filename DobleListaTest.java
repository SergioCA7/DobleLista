package Hola.DobleLista;

import static org.junit.Assert.*;

import org.junit.Test;

import Hola.DobleLista.Lista.Nodo;

public class DobleListaTest {

	@Test
	public void createList(){
		Lista list = new Lista();
		Nodo first = list.crearNodo(1);
		Nodo last = list.crearNodo(5);
		Nodo empty = null;
		assertEquals(empty, list.getprimero());
		assertEquals(empty, list.getsultimo());
	}
	
	@Test
	public void insertFirstEmptyList(){
		Lista list = new Lista();
		Nodo unique = list.crearNodo(2);
		list.insertarPrincipio(unique);
		assertEquals(unique, list.getprimero());
	}
	
	@Test
	public void insertLastEmptyList(){
		Lista list = new Lista();
		Nodo unique = list.crearNodo(2);
		list.insertarFinal(unique);
		assertEquals(unique, list.getsultimo());
	}
	
	@Test
	public void insertFirstAndLastList(){
		Lista list = new Lista();
		Nodo n1 = list.crearNodo(3);
		Nodo n2 = list.crearNodo(6);
		list.insertarPrincipio(n1);
		list.insertarFinal(n2);
		Nodo first = list.crearNodo(2);
		Nodo last = list.crearNodo(7);
		list.insertarPrincipio(first);
		list.insertarFinal(last);
		assertEquals(first, list.getprimero());
		assertEquals(last, list.getsultimo());
	}
	
	@Test
	public void insertAfter(){
		Lista list = new Lista();
		Nodo first = list.crearNodo(1);
		Nodo n1 = list.crearNodo(3);
		list.insertarPrincipio(first);
		list.insertarFinal(n1);
		Nodo n2 = list.crearNodo(2);
		Nodo last = list.crearNodo(5);
		list.insertDespues(first, n2);
		list.insertDespues(n1, last);
		assertEquals(last, list.getsultimo());
		list.borrarDato(first);
		assertEquals(n2, list.getprimero());
		list.borrarDato(last);
		assertEquals(n1, list.getsultimo());
	}
	
	@Test
    public void insertarAntesDeUno(){
    	Lista list = new Lista();
    	Nodo node2 = list.crearNodo(2);
    	list.insertarPrincipio(node2);
    	Nodo node3 = list.crearNodo(4);
    	list.insertarFinal(node3);
    	Nodo node = list.crearNodo(3);
    	list.insertarAntes(node3, node);
    	assertEquals(node,list.getsultimo().getAnt());
    	assertEquals(node,list.getprimero().getNext());
	}
	
	@Test
    public void removeBefore(){
    	Lista list = new Lista();
    	Nodo node2 = list.crearNodo(2);
    	list.insertarPrincipio(node2);
    	Nodo node3 = list.crearNodo(4);
    	list.insertarFinal(node3);
    	Nodo node = list.crearNodo(3);
    	list.insertarAntes(node3, node);
    	list.borrarDato(node);
    	assertEquals(node3,list.getsultimo());
    	assertEquals(node2,list.getprimero());
	}
	
	

}
