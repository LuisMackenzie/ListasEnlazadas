package com.mackenzie;

public class Main {

    public static void main(String[] args) {


        Lista listaenlazada = new Lista();
        listaenlazada.insertarPrincipio(new Libro("peli 01", "Braulio", "985"));
        listaenlazada.insertarPrincipio(new Libro("peli 02", "Cecilio", "567"));
        listaenlazada.insertarPrincipio(new Libro("peli 03", "Raquel", "039"));
        listaenlazada.insertarPrincipio(new Libro("peli 04", "Alberto", "475"));
        listaenlazada.insertarPrincipio(new Libro("peli 05", "Demetrio", "985"));
        listaenlazada.insertarPrincipio(new Libro("peli 06", "Aurelio", "567"));
        listaenlazada.insertarPrincipio(new Libro("peli 07", "Eustaquio", "039"));
        listaenlazada.insertarPrincipio(new Libro("peli 08", "Basilio", "475"));

        // Funciones para insertar un objeto
        // listaenlazada.insertarPrincipio(new Libro("peli 08", "Basilio", "475"));
        // listaenlazada.insertarFinal(new Libro("peli 08", "Basilio", "475"));
        // listaenlazada.insertarDespues(3, new Libro("peli 08", "Basilio", "475"));

        // Funciones para borrar objetos en la lista
        // listaenlazada.eliminarFinal();
        // listaenlazada.eliminarPrincipio();
        // listaenlazada.eliminarLibro(3);

        // Funciones para obtener y mostar
        // listaenlazada.obtener(2);
        listaenlazada.mostrarLista();


    }
}
