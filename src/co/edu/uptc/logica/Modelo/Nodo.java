package co.edu.uptc.logica.Modelo;

public class Nodo {
    private Nodo padre,izquierda,derecha;
    private String cosaEscrita;

    private int clave;
    public Nodo(int clave, String cosaEscrita ){
        this.clave=clave;
        this.cosaEscrita=cosaEscrita;

        padre=null;
        izquierda=null;
        derecha=null;

    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public String getCosaEscrita() {
        return cosaEscrita;
    }

    public int getClave() {
        return clave;
    }
}
