package listaligada;

public class Nodo <T>{
    private T dato;//dato almacenado
    private Nodo siguiente; //apuntador al siguiente nodo

public Nodo(T d){
    this.dato = d;
    this.siguiente = null;
}

public T getDato() {
    return dato;
}

public void setDato(T dato) {
    this.dato = dato;
}

public Nodo getSiguiente() {
    return siguiente;
}

public void setSiguiente(Nodo otroNodo){
    this.siguiente = otroNodo;
}

}
