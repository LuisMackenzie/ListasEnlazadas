package com.mackenzie;

public class Nodo2 {

    private int dato;
    private Nodo2 ref;

    public Nodo2(int dato) {
        this.dato = dato;
        ref = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo2 getRef() {
        return ref;
    }

    public void setRef(Nodo2 ref) {
        this.ref = ref;
    }
}
