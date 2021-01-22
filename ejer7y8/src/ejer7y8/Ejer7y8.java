/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7y8;

/**
 *
 * @author Nestor
 */
public class Ejer7y8 {

    static void iniciarMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    static void mostrarMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    static int[] maximoFilas(int m[][]) {
        int maximo[] = new int[m.length];

        for (int i = 0; i < m.length; i++) {
            maximo[i] = m[i][0];
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] > maximo[i]) {
                    maximo[i] = m[i][j];
                }
            }
        }
        return maximo;
    }

    static void escribirVector(int maximo[]) {
        for (int i = 0; i < maximo.length; i++) {
            System.out.print(maximo[i] + " | ");
        }
        System.out.println(" ");
    }

    static float mediaMaximos(int maximo[]) {
        int suma = 0;
        float media = 0;
        int cont = 0;
        for (int i = 0; i < maximo.length; i++) {
            suma = suma + maximo[i];
            cont++;

        }
        media = (float) suma / cont;
        return media;
    }

    public static void main(String[] args) {
        int m[][] = new int[3][3];
        int maximo[] = new int[3];
        float media;
        iniciarMatriz(m);
        mostrarMatriz(m);
        maximo = maximoFilas(m);
        escribirVector(maximo);
        media = mediaMaximos(maximo);
        System.out.println("La media es: " + media);

    }

}
