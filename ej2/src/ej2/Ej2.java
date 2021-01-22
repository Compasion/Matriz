/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import java.util.Scanner;

/**
 *
 * @author Nestor
 */
public class Ej2 {

   static void generarMatriz(int m[][]){
       int ale;
       
       for (int i = 0; i < m.length; i++) {
           for (int j = 0; j < m[i].length; j++) {
               ale=(int) (Math.random()*7);
               m[i][j]=ale;
           }
       }
   }
   static void mostrarMatriz(int m[][]){
       for (int i = 0; i < m.length; i++) {
           for (int j = 0; j < m[i].length; j++) {
               System.out.print(m[i][j] + " ");
           }
           System.out.println("");
       }
   }
   static int cuantasVeces(int m[][], int n){
       int cont=0;
       for (int i = 0; i < m.length; i++) {
           for (int j = 0; j < m[i].length; j++) {
               if(m[i][j]==n){
                   cont++;
               }
           }
       }
       return cont;
   }
   static int [] primeraOcurrencia(int m[][], int n){
       int pos[] = new int[2];
       boolean esta=false;
       
       for (int i = 0; i < m.length; i++) {
           for (int j = 0; j < m[i].length; j++) {
               if(m[i][j]==n && !esta){
                   esta=true;
                   pos[0] = i;
                   pos[1] = j;
               }
           }
       }
      return pos;
   }
   
   
    public static void main(String[] args) {
        int n;
        boolean esta;
        int cont;
        int m[][]= new int[4][4];
        int p[];
        
        
        generarMatriz(m);
        mostrarMatriz(m);
        Scanner sc= new Scanner(System.in);
        System.out.println("Dame el numero a encontrar: ");
        n=sc.nextInt();
        cont=cuantasVeces(m, n);
        System.out.println("El numero " + n + " esta " + cont + " veces");
        p = primeraOcurrencia(m, n);
        System.out.println("Esta en la fila " + p[0]  + " y en la columna " + p[1]);            
    }
    
}
