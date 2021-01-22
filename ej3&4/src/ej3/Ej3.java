/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author Borja
 */
public class Ej3 {

    static void llenarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
    }

    static void escribirMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static int cuantosPares(int[][] m) {
        int cont = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 == 0) {
                    cont++;
                }
            }
        }
        return cont;
    }

    static float[] mediaPares(int[][] m) {
        int suma = 0, cont = 0;
        float[] resultado = new float[2];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 == 0) {
                    suma = suma + m[i][j];
                    cont++;
                }
            }
        }
        resultado[0] = (float) suma / cont;
        resultado[1] = suma;
        return resultado;
    }

    static float mediaImpares(int[][] m) {
        int suma = 0, cont = 0;
        float media;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 != 0) {
                    suma = suma + m[i][j];
                    cont++;
                }
            }
        }
        media = (float) suma / cont;
        return media;
    }

    static float sumaImpares(int[][] m) {
        int suma = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 != 0) {
                    suma = suma + m[i][j];
                }
            }
        }
        return suma;
    }

    static float mediaPosPares(int[][] m) {
        int suma = 0, cont = 0;
        float media;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    suma = suma + m[i][j];
                    cont++;
                }
            }
        }
        media = (float) suma / cont;

        return media;
    }

    static float mediaPosImpares(int[][] m) {
        int suma = 0, cont = 0;
        float media;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if ((i + j) % 2 != 0) {
                    suma = suma + m[i][j];
                    cont++;
                }
            }
        }
        media = (float) suma / cont;

        return media;
    }

    public static void main(String[] args) {
        int[][] m = new int[3][3];
        int cont = 0;
        float suma;
        float media;
        float[] resultados = new float[2];

        //Vector medias:
        //pos 0 = Medias Pares, pos 1 = Medias Impares, pos 2 = Medias Posiciones Pares, pos 3 = Medias Posiciones Impares
        llenarMatriz(m);
        escribirMatriz(m);
        
        cont = cuantosPares(m);
        System.out.println("Hay " + cont + " numeros pares");

        resultados = mediaPares(m);
        System.out.println("La media de los Pares es: " + resultados[0] + " y la suma: " + resultados[1]);

        suma = sumaImpares(m);
        media = mediaImpares(m);
        System.out.println("La media de los Impares es: " + media + " y la suma: " + suma);

        media = mediaPosPares(m);
        System.out.println("La media de las posiciones Pares es: " + media);

        media = mediaPosImpares(m);
        System.out.println("La media de las posiciones Impares es: " + media);
    }

}
