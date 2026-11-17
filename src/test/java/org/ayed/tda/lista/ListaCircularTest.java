package org.ayed.tda.lista;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListaCircularTest {
    private ListaCircular<Integer> lista;

    @BeforeEach
    void setUp() {
        lista = new ListaCircular<>();
    }

    @Test
    void Lista_circular_nueva_esta_vacia() {
        assertTrue(lista.vacio());
        assertEquals(0, lista.tamanio());
    }

    @Test
    void Lista_circular_agregar_al_final() {
        lista.agregar(1);
        lista.agregar(2);
        assertEquals(2, lista.tamanio());
        assertEquals(2, lista.dato(1));
    }

    @Test
    void Lista_circular_agregar_indice() {
        lista.agregar(1);
        lista.agregar(2, 0);
        assertEquals(2, lista.dato(0));
        assertEquals(1, lista.dato(1));
    }

    @Test
    void Lista_circular_no_puede_agregar_en_indice_invalido() {
        assertThrows(ExcepcionLista.class, () -> lista.agregar(1, -1));
        assertThrows(ExcepcionLista.class, () -> lista.agregar(1, 1));
    }

    @Test
    void Lista_circular_eliminar_quita_el_ultimo() {
        lista.agregar(1);
        lista.agregar(2);
        assertEquals(2, lista.eliminar());
        assertEquals(1, lista.tamanio());
    }

    @Test
    void Lista_circular_no_puede_eliminar_si_esta_vacia() {
        assertThrows(ExcepcionLista.class, () -> lista.eliminar());
        assertThrows(ExcepcionLista.class, () -> lista.eliminar(0));
    }

    @Test
    void Lista_circular_no_puede_usar_indice_fuera_de_rango() {
        lista.agregar(1);
        assertThrows(ExcepcionLista.class, () -> lista.dato(-1));
        assertThrows(ExcepcionLista.class, () -> lista.dato(1));
        assertThrows(ExcepcionLista.class, () -> lista.eliminar(1));
    }

    @Test
    void Lista_circular_eliminar_el_unico_dato_la_deja_vacia() {
        lista.agregar(1);
        assertEquals(1, lista.eliminar(0));
        assertTrue(lista.vacio());
        lista.agregar(2);
        assertEquals(2, lista.dato(0));
    }

    @Test
    void Lista_circular_caso_de_uso() {
        Integer[] esperado = {1, 2, 9, 3, 5, 6, 7, 10};

        // [1, 2, 3, 4, 5, 6, 7, 8]
        for (int i = 1; i <= 8; i++) {
            lista.agregar(i);
        }
        // [1, 2, 9, 3, 4, 5, 6, 7, 8]
        lista.agregar(9, 2);
        // [1, 2, 9, 3, 5, 6, 7, 8]
        lista.eliminar(4);
        // [1, 2, 9, 3, 5, 6, 7]
        lista.eliminar();
        // [1, 2, 9, 3, 5, 6, 7, 10]
        lista.agregar(10);

        assertEquals(esperado.length, lista.tamanio());
        for (int i = 0; i < esperado.length; i++) {
            assertEquals(esperado[i], lista.dato(i));
        }
    }
}
