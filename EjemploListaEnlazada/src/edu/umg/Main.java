package edu.umg;

public class Main {

    public static void main(String[] args) {

        //10,40,25
        ListaEnlazadaSimple<Integer> listaEnteros = new ListaEnlazadaSimple<Integer>();
        listaEnteros.agregarAlInicio(5);
        listaEnteros.agregarAlInicio(2);
        listaEnteros.agregarAlInicio(10);
        listaEnteros.agregarAlFinal(100);
        //listaEnteros.recorrer();

        Nodo<Integer> resultadoInt = listaEnteros.buscar(99);
        if( resultadoInt == null ){
            System.out.println("El valor entero buscado no existe en la lista enlazada");
        }else{
            System.out.println("Si existe: " + resultadoInt.getDato() );
        }

        //Sheyla, Merleen, Jose Eduardo
        ListaEnlazadaSimple<String> listaStrings  = new ListaEnlazadaSimple<String>();
        listaStrings.agregarAlInicio("Jose Eduardo");
        listaStrings.agregarAlInicio("Merleen");
        listaStrings.agregarAlInicio("Sheyla");
        //listaStrings.recorrer();
        Nodo<String> resultadoString = listaStrings.buscar("Sheyla");
        if( resultadoString == null ){
            System.out.println("El valor String buscado no existe en la lista enlazada");
        }else{
            System.out.println("Si existe: " + resultadoString.getDato() );
        }



        //{Bitcoin, $40,000}, {Ethereum, $3,000}, {Litecoin, $150}
        ListaEnlazadaSimple<Criptomoneda> listaCriptomonedas  = new ListaEnlazadaSimple<Criptomoneda>();
        listaCriptomonedas.agregarAlInicio(new Criptomoneda("BITCOIN", 40000.00));
        listaCriptomonedas.agregarAlInicio(new Criptomoneda("ETHEREUM", 3000.00));
        listaCriptomonedas.agregarAlInicio(new Criptomoneda("LITECOIN", 150.00));
        //listaCriptomonedas.recorrer();
        Nodo<Criptomoneda> resultadoCriptomoneda = listaCriptomonedas.buscar(new Criptomoneda("DOGECOIN"));
        if( resultadoCriptomoneda == null ){
            System.out.println("El valor Criptomoneda buscado no existe en la lista enlazada");
        }else{
            System.out.println("Si existe: " + resultadoCriptomoneda.getDato() );
        }


    }

}
