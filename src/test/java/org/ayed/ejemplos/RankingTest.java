package org.ayed.ejemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RankingTest {

    @Test
    void Ranking_devuelve_el_mejor_puntaje() {
        Ranking ranking = new Ranking();
        ranking.add(5);
        ranking.add(9);
        ranking.add(2);
        assertEquals(9, ranking.getMejor());
    }

    @Test
    void Ranking_encuentra_un_puntaje_agregado() {
        Ranking ranking = new Ranking();
        ranking.add(5);
        assertTrue(ranking.esta(5));
        assertFalse(ranking.esta(6));
    }
}
