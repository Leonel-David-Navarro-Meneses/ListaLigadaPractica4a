package listaligada;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.BiPredicate;
import java.io.IOException;

public class TestingListaLigada {
    
    public static void main(String[] args) throws IOException{
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int dato;

        char respuesta;
        ListaLigada lista = new ListaLigada();
        
     while(true){//ciclo infinito

        

        System.out.println("escribe un dato entero: ");
        entrada= bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);
        System.out.println("se ha agregado el dato a la lista");
        System.out.println("quieres agregar mas datos? (s/n)");
        entrada = bufer.readLine();
        respuesta = entrada.charAt(0);
        if(respuesta == 'n' || respuesta == 'N')
        break;
    }
        

        System.out.println("---------------------------");
        System.out.println("contenido de la lista ligada");
        lista.printList();

        /*
        System.out.println("--------------------------");
        System.out.println("insercion de un nuevo nodo");
        System.out.println("escribe el elemento a insertar");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        System.out.println("escribe la posiscion de donde quieres insertar: ");
       entrada= bufer.readLine();
       int p = Integer.parseInt(entrada);
       lista.add(dato, p);

       System.out.println("----------------");
       System.out.println("contenido de la lista ligada: ");
       lista.printList();
    } */

    //nueva listaligada, ahora con Strings
    ListaLigada<String> lista2 = new ListaLigada<>();
    System.out.println("---creando una lista de Strnigs ----");
    for(;;){
        System.out.println("escribe dato String para agregar a la lista: ");
        entrada = bufer.readLine();
        respuesta = entrada.charAt(0);
        if(respuesta == 'n' || respuesta == 'N')
        break;
    }
System.out.println("contenido de la lista de strings: ");
lista2.printList();
}

}