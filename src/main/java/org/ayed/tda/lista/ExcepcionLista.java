package org.ayed.tda.lista;

public class ExcepcionLista extends RuntimeException {
    /**
     * @param mensaje Mensaje de error.
     */
    public ExcepcionLista(String mensaje) {
        super(mensaje);
    }
}
