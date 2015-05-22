package pkgLista;

public class Lista {
	public class Nodo
	{
	    int dato;
	    Nodo next;
	    Nodo ant;
	    Nodo(int numeroDato){
	        this.dato=numeroDato;
	        this.next=null;
	        this.ant=null;
	    }
	    public Nodo getNext(){
	    	return next;
	    }
	    public Nodo getAnt(){
	    	return ant;
	    }
	}
	private Nodo primero;
    private Nodo ultimo;
    public Lista(){
        primero=null;
        ultimo=null;
    }
	 public boolean estavacio(){
	        if(primero==null) return true;
	        else return false;
	    }
	 
	 public Nodo getprimero(){
		 return primero;
	 }
	 public Nodo getsultimo(){
		 return ultimo;
	 }
	 public void insertarFinal(Nodo nuevoNodo){
	        if(estavacio()){
	            primero=nuevoNodo;
	            ultimo=nuevoNodo;
	        } else {
	            ultimo.next=nuevoNodo;
	            nuevoNodo.ant=ultimo;
	            ultimo=nuevoNodo;
	        }
	       
	    }
	 public void borrarDato(Nodo nodo){
		  if (nodo.ant == null) {
		      primero = nodo.next;
		    } else if (nodo.next == null) {
		      ultimo = nodo.ant;
		    } else {
		      nodo.ant.next = nodo.next;
		      nodo.next.ant = nodo.ant;
		    }

	    }
	 public void insertarAntes(Nodo nodo, Nodo nuevoNodo) {
		    nuevoNodo.ant = nodo.ant;
		    nuevoNodo.next = nodo;
		    if (nodo.ant == null) {
		      primero = nuevoNodo;
		      nodo.ant = nuevoNodo;
		    } else {
		      nodo.ant.next = nuevoNodo;
		      nodo.ant = nuevoNodo;
		    }
		  }
	  public void insertDespues(Nodo nodo, Nodo nuevoNodo) {
		    nuevoNodo.ant = nodo;
		    nuevoNodo.next = nodo.next;
		    if (nodo.next == null) { 
		      ultimo = nuevoNodo;
		      nodo.next = nuevoNodo;
		    } else { 
		      nodo.next.ant = nuevoNodo;
		      nodo.next = nuevoNodo;
		    }
		  }
		  
	 public void insertarPrincipio(Nodo nodo){
		 if(estavacio()){
			 primero = nodo;
			 ultimo = nodo;
		 } else {
		 insertarAntes(nodo,primero);
		 }
	 }
	 
	 
	 public Nodo crearNodo(int numero){ 
		 //Para las pruebas
		 Nodo n = new Nodo(numero);
		 return n;
		  
	 }
	 
	 

}