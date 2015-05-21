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
	 public void insertarFinal(int dato){
	        if(estavacio()){
	            Nodo nuevoNodo=new Nodo(dato);
	            primero=nuevoNodo;
	            ultimo=nuevoNodo;
	        } else {
	            Nodo nuevoNodo=new Nodo(dato);
	            ultimo.next=nuevoNodo;
	            nuevoNodo.ant=ultimo;
	            ultimo=nuevoNodo;
	        }
	       
	    }
	 public boolean borrarDato(int num)
	    {
	        Nodo anterior=null;
	        Nodo actual=primero;
	        while(actual!=ultimo){
	            if(actual.dato==num){
	                if(anterior==null){
	                    primero=actual.next;
	                    primero.ant=null;
	                }else{
	                    anterior.next=actual.next;
	                    Nodo temporal;
	                    temporal=actual.next;
	                    temporal.ant=anterior;
	                }
	                return true;
	            }
	            anterior=actual;
	            actual=actual.next;
	        }
	        if(num==ultimo.dato)
	        {
	            ultimo=actual.ant;
	            return true;
	        }
	        return false;
	    }
	 public void insertarAntes(int numero,Nodo nodoDespues){
		 Nodo nuevoNodo=new Nodo(numero);
		 nuevoNodo.ant = nodoDespues.ant;
		 nuevoNodo.next = nodoDespues;
		 if(nodoDespues.ant == null){
			 primero = nuevoNodo;
		 } else {
			 nodoDespues.ant.next = nuevoNodo;
			 nodoDespues.ant = nuevoNodo;
		 }

	 }
	 public void insertarDespues(int numero,Nodo nodoAntes){
		 Nodo nuevoNodo = new Nodo(numero);
		 nuevoNodo.ant = nodoAntes;
		 nuevoNodo.next = nodoAntes.next;
		 if(nodoAntes.next == null){
			 ultimo = nuevoNodo;
		 } else {
			 nodoAntes.next.ant = nuevoNodo;
			 nodoAntes.next = nuevoNodo;
		 }
	 }
	 public void insertarPrincipio(int numero){
		 Nodo nuevoNodo=new Nodo(numero);
		 if(estavacio()){
			 primero = nuevoNodo;
			 ultimo = nuevoNodo;
		 } else {
		 insertarAntes(numero,primero);
		 }
	 }
	 
	 

}
