/*
 * CREA UNA MATRIZ NxM DE VALORES REALES Y DEVUELVE OTRA CON UNA FILA Y COLUMNA EXTRA EN LA QUE ESTÁN SUS SUMAS
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número de FILAS de la matriz");
        int dim1 = sc.nextByte();
        System.out.println("Escribe el número de COLUMNAS de la matriz");
        int dim2 = sc.nextByte();
        int[][] m1 = new int[dim1][dim2];
        int[][] m2 = new int[dim1 + 1][dim2 + 1];

        rellenarMatriz(m1);
        suma(m1, m2);
        System.out.println("RESULTADO:");
        pintarMatriz(m2);
    }

    static void suma(int[][] m1, int[][] m2) {
        //Rellena la matriz resultado con 0s
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = 0;
            }
        }

        for (int i = 0; i < m2.length - 1; i++) {
            for (int j = 0; j < m2[i].length - 1; j++) {
                m2[i][j] = m1[i][j];
                m2[i][m2[i].length - 1] += m1[i][j];
                m2[m2.length - 1][j] += m1[i][j];
                m2[m2.length - 1][m2[0].length - 1] += m1[i][j];  //Coloca un 0 en la esquina inferior derecha de la matriz resultado
            }
        }
        //m2[m2.length-1][m2[m2.length-1].length-1] = 0;  //Coloca un 0 en la esquina inferior derecha de la matriz resultado
    }

    static void pintarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

}
