package org.ayed.tda.lista;

/**
 * Lista circular simplemente enlazada: el último nodo apunta al primero.
 * Los índices van de 0 a tamanio() - 1.
 *
 * @param <T> Tipo de dato que almacena la lista.
 */
public class ListaCircular<T> {

    /**
     * Crea una lista vacía.
     */
    public ListaCircular() {
        throw new UnsupportedOperationException("TODO: Completar");
    }

    /**
     * Agrega el dato al final de la lista.
     * Complejidad: O(1).
     *
     * @param dato Dato a agregar.
     */
    public void agregar(T dato) {
        throw new UnsupportedOperationException("TODO: Completar");
    }

    /**
     * Agrega el dato en la posición indicada, desplazando los siguientes.
     *
     * @param dato   Dato a agregar.
     * @param indice Posición. Debe estar entre 0 y tamanio(), inclusive.
     * @throws ExcepcionLista si el índice no es válido.
     */
    public void agregar(T dato, int indice) {
        throw new UnsupportedOperationException("TODO: Completar");
    }

    /**
     * Elimina el último dato de la lista.
     *
     * @return el dato eliminado.
     * @throws ExcepcionLista si la lista está vacía.
     */
    public T eliminar() {
        throw new UnsupportedOperationException("TODO: Completar");
    }

    /**
     * Elimina el dato de la posición indicada.
     *
     * @param indice Posición. Debe estar entre 0 y tamanio() - 1, inclusive.
     * @return el dato eliminado.
     * @throws ExcepcionLista si el índice no es válido.
     */
    public T eliminar(int indice) {
        throw new UnsupportedOperationException("TODO: Completar");
    }

    /**
     * Obtiene el dato de la posición indicada.
     *
     * @param indice Posición. Debe estar entre 0 y tamanio() - 1, inclusive.
     * @return el dato de esa posición.
     * @throws ExcepcionLista si el índice no es válido.
     */
    public T dato(int indice) {
        throw new UnsupportedOperationException("TODO: Completar");
    }

    /**
     * @return la cantidad de datos de la lista.
     */
    public int tamanio() {
        throw new UnsupportedOperationException("TODO: Completar");
    }

    /**
     * @return true si la lista no tiene datos.
     */
    public boolean vacio() {
        throw new UnsupportedOperationException("TODO: Completar");
    }
}
