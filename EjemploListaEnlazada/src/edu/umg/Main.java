package edu.umg;

public class Main {

    public static void main(String[] args) {

        //10,40,25
        ListaEnlazadaSimple<Integer> listaEnteros = new ListaEnlazadaSimple<Integer>();
        listaEnteros.agregarAlInicio(25);
        listaEnteros.agregarAlInicio(40);
        listaEnteros.agregarAlInicio(10);

        //Sheyla, Merleen, Jose Eduardo
        ListaEnlazadaSimple<String> listaStrings  = new ListaEnlazadaSimple<String>();
        listaStrings.agregarAlInicio("Jose Eduardo");
        listaStrings.agregarAlInicio("Merleen");
        listaStrings.agregarAlInicio("Sheyla");

        //{Bitcoin, $40,000}, {Ethereum, $3,000}, {Litecoin, $150}
        ListaEnlazadaSimple<Criptomoneda> listaCriptomonedas  = new ListaEnlazadaSimple<Criptomoneda>();
        listaCriptomonedas.agregarAlInicio(new Criptomoneda("BITCOIN", 40000.00));
        listaCriptomonedas.agregarAlInicio(new Criptomoneda("ETHEREUM", 3000.00));
        listaCriptomonedas.agregarAlInicio(new Criptomoneda("LITECOIN", 150.00));


    }
}
