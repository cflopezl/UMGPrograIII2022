package edu.umg;

public class ListaEnlazadaSimple<T> {
    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private Nodo<T> actual;
    private int cantidad;

    public ListaEnlazadaSimple() {
        cantidad = 0;
        primero = null;
        ultimo = null;
        actual = null;
    }

    public void agregarAlInicio( T info ){

        //1. Crear un nodo e inicializar el campo dato al nuevo elemento (info).
        // La referencia del nodo creado se asigna a nuevo, variable local del método.
        Nodo<T> nuevoNodo = new Nodo<T>(info);

        //2. Hacer que el campo siguiente del nuevo nodo apunte a primero de la lista original.
        nuevoNodo.setSiguiente(primero);

        //3. Hacer que primero apunte al nuevo nodo.
        primero = nuevoNodo;

        //4. Asignar el valor del ultimo únicamente cuando la lista se encuentra vacía
        if( cantidad == 0 ){
            ultimo = nuevoNodo;
        }

        cantidad++;

    }

    public void agregarAlFinal( T info ){

        //1. Crear un nodo e inicializar el campo dato al nuevo elemento (info).
        // La referencia del nodo creado se asigna a nuevo, variable local del método.
        Nodo<T> nuevoNodo = new Nodo<T>(info);

        //2. El puntero siguiente del ultimo nodo debe apuntar al nuevoNodo
        ultimo.setSiguiente(nuevoNodo);

        //3. actualizar el valor de ultimo para que apunte al nuevoNodo
        ultimo = nuevoNodo;

        //4. Asignar el valor del primero únicamente cuando la lista se encuentra vacía
        if( cantidad == 0 ){
            primero = nuevoNodo;
        }

        cantidad++;

    }

    public void recorrer(){

        //1. ubicar el primer elemento de la lista
        actual = primero;

        while(  actual != null  ) {
            //2. leer el dato y mostrarlo en pantalla
            System.out.print(actual.getDato() + " -> ");

            //3. Identificar su siguiente nodo
            actual = actual.getSiguiente();
        }

        System.out.println("null");

    }

    /**
     * Metodo para buscar nodos en una lista enlazada
     * @param datoABuscar enviar el dato a buscar
     * @return null=no existe el nodo o <>null si existe el elmento
     */
    public Nodo<T> buscar(T datoABuscar){

        //1. ubicar el primer elemento de la lista
        actual = primero;

        while( actual != null && !actual.getDato().equals(datoABuscar) ) {

            //3. Identificar su siguiente nodo
            actual = actual.getSiguiente();

        }

        return actual;

    }

}
