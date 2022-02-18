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

        cantidad++;


    }


}
