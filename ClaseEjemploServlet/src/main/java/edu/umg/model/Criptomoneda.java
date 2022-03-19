package edu.umg.model;

public class Criptomoneda {
    String nombre;
    String acronimo;
    double valor;

    public Criptomoneda(String nombre, String acronimo) {
        this.nombre = nombre;
        this.acronimo = acronimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
