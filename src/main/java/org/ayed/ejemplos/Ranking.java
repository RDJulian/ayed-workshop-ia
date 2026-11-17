package org.ayed.ejemplos;

public class Ranking {
    public int[] p = new int[10];
    public int cant = 0;

    // agrega
    public void add(int x) {
        if (cant<10) {
            p[cant]=x; // guardo el puntaje
            cant++; // incremento cant
        }
    }

    public int getMejor() {
        int m = 0;
        for (int i = 0; i < cant; i++) {
            if (p[i] > m) {
                m = p[i];
            }
        }
        return m;
    }

    public boolean esta(int x) {
        boolean r = false;
        for (int i = 0; i < cant; i++) {
            if (p[i] == x) {
                r = true;
                break;
            }
        }
        return r;
    }

    public void ordenarEImprimir() {
        for (int i = 0; i < cant; i++) {
            for (int j = 0; j < cant - 1; j++) {
                if (p[j] < p[j + 1]) {
                    int aux = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < cant; i++) {
            System.out.println((i + 1) + ". " + p[i]);
        }
    }
}
