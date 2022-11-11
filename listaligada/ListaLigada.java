package listaligada;

public class ListaLigada <T>{
    private Nodo head; // apuntador a la cabecera de la lista (primer nodo)
    private Nodo tail;//apuntador a la cola de la lista (ultimo nodo)
    private Nodo actual; // apuntador al nodo seleccionado actualmente
    private int size; //tamaño de la lista (numero de nodos en la lista)

    public ListaLigada(){
        this.head = null;
        this.actual = null;
        this.tail = null;
        this.size = 0;
    }

/*public void addFirst(int dato){
    Nodo nodo = new Nodo(dato);
    this.head = nodo;

    this.tail = nodo;
    this.actual = nodo;
    this.size++;
}
*/

public void add(T dato){
       Nodo nuevoNodo = new Nodo(dato);
       this.size++;
       this.tail = nuevoNodo;//semueve el apuntador al ultimo nodo

if(head == null){
    head = nuevoNodo;
   actual = head;
}else{

       actual.setSiguiente(nuevoNodo);//actual apunta al nuevoNodo(enlace entre nodos)
       actual = nuevoNodo;//ahora actual es el nuevoNodo
}

    }


public void add(T dato, int posicion){
    Nodo nuevoNodo = new Nodo(dato);
    int i = 1;
    actual = head;
    while(i < posicion - 1){
        actual = actual.getSiguiente();
        i++;
    }
    Nodo auxiliar = actual.getSiguiente();
    actual.setSiguiente(nuevoNodo);
    actual = nuevoNodo;
    actual.setSiguiente(auxiliar);
}

public void printList(){
    int posicion = 1;
    actual = head;
    while(actual != null){
        T elemento = (T) actual.getDato();
        System.out.println("Dato = " + elemento + " almacenado en nodo: " + posicion);
        actual = actual.getSiguiente();
        posicion++;
    }
}

public void eliminarInicio(){

}

public void eliminarFinal(){

}

public void eliminadorEspecifico(){

}



}

        