package org.ayed.tda.lista;

/**
 * Lista circular simplemente enlazada: el último nodo apunta al primero.
 * Los índices van de 0 a tamanio() - 1.
 *
 * @param <T> Tipo de dato que almacena la lista.
 */
public class ListaCircular<T> {

    /**
     * Nodo de la lista: guarda un dato y apunta al siguiente.
     *
     * @param <T> Tipo de dato que almacena el nodo.
     */
    private static final class Nodo<T> {
        private final T dato;
        private Nodo<T> siguiente;

        /**
         * Crea un nodo sin siguiente.
         *
         * @param dato Dato a guardar.
         */
        private Nodo(T dato) {
            this.dato = dato;
        }
    }

    // Solo se guarda el último: su siguiente es el primero.
    private Nodo<T> ultimo;
    private int tamanio;

    /**
     * Crea una lista vacía.
     */
    public ListaCircular() {
        ultimo = null;
        tamanio = 0;
    }

    /**
     * Agrega el dato al final de la lista.
     * Complejidad: O(1).
     *
     * @param dato Dato a agregar.
     */
    public void agregar(T dato) {
        agregar(dato, tamanio);
    }

    /**
     * Agrega el dato en la posición indicada, desplazando los siguientes.
     *
     * @param dato   Dato a agregar.
     * @param indice Posición. Debe estar entre 0 y tamanio(), inclusive.
     * @throws ExcepcionLista si el índice no es válido.
     */
    public void agregar(T dato, int indice) {
        validarIndice(indice, tamanio);
        Nodo<T> nuevo = new Nodo<>(dato);
        if (vacio()) {
            nuevo.siguiente = nuevo;
        } else {
            Nodo<T> anterior = nodoAnterior(indice);
            nuevo.siguiente = anterior.siguiente;
            anterior.siguiente = nuevo;
        }
        if (indice == tamanio) {
            ultimo = nuevo;
        }
        tamanio++;
    }

    /**
     * Elimina el último dato de la lista.
     *
     * @return el dato eliminado.
     * @throws ExcepcionLista si la lista está vacía.
     */
    public T eliminar() {
        if (vacio()) {
            throw new ExcepcionLista("La lista está vacía");
        }
        return eliminar(tamanio - 1);
    }

    /**
     * Elimina el dato de la posición indicada.
     *
     * @param indice Posición. Debe estar entre 0 y tamanio() - 1, inclusive.
     * @return el dato eliminado.
     * @throws ExcepcionLista si el índice no es válido.
     */
    public T eliminar(int indice) {
        validarIndice(indice, tamanio - 1);
        Nodo<T> anterior = nodoAnterior(indice);
        Nodo<T> eliminado = anterior.siguiente;
        anterior.siguiente = eliminado.siguiente;
        tamanio--;
        if (eliminado == ultimo) {
            ultimo = vacio() ? null : anterior;
        }
        return eliminado.dato;
    }

    /**
     * Obtiene el dato de la posición indicada.
     *
     * @param indice Posición. Debe estar entre 0 y tamanio() - 1, inclusive.
     * @return el dato de esa posición.
     * @throws ExcepcionLista si el índice no es válido.
     */
    public T dato(int indice) {
        validarIndice(indice, tamanio - 1);
        return nodoAnterior(indice).siguiente.dato;
    }

    /**
     * @return la cantidad de datos de la lista.
     */
    public int tamanio() {
        return tamanio;
    }

    /**
     * @return true si la lista no tiene datos.
     */
    public boolean vacio() {
        return tamanio == 0;
    }

    /**
     * Verifica que el índice esté entre 0 y el máximo, inclusive.
     *
     * @param indice Posición a verificar.
     * @param maximo Mayor posición permitida.
     * @throws ExcepcionLista si el índice es negativo o mayor que el máximo.
     */
    private void validarIndice(int indice, int maximo) {
        if (indice < 0 || indice > maximo) {
            throw new ExcepcionLista("Índice inválido: " + indice);
        }
    }

    /**
     * Busca el nodo que precede a la posición indicada.
     * Para la posición 0 y para tamanio() es el último, sin recorrer la lista.
     *
     * @param indice Posición. Debe estar entre 0 y tamanio(), inclusive, con la lista no vacía.
     * @return el nodo anterior a esa posición.
     */
    private Nodo<T> nodoAnterior(int indice) {
        if (indice == tamanio) {
            return ultimo;
        }
        Nodo<T> anterior = ultimo;
        for (int i = 0; i < indice; i++) {
            anterior = anterior.siguiente;
        }
        return anterior;
    }
}
