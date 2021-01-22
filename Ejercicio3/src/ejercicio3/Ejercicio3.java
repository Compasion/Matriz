/*
 * INICIA UN VECTOR NxM Y DEVUELVE EL NÚMERO DE VALORES PARES QUE HAY EN ELLA
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número de FILAS de la matriz");
        int dim1 = sc.nextByte();
        System.out.println("Escribe el número de COLUMNAS de la matriz");
        int dim2 = sc.nextByte();
        int[][] m = new int[dim1][dim2];
        
        rellenarMatriz(m);
        System.out.println("MATRIZ:");
        pintarMatriz(m);
        System.out.println("Se han encontrado "+contarPares(m)+" numeros pares");
        
    }
    
    static int contarPares (int[][] m){
        int cont = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] % 2 == 0){
                    cont++;
                }
            }
        }
        return cont;
    }
    
    static void pintarMatriz(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    static void rellenarMatriz (int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
    }
    
}
