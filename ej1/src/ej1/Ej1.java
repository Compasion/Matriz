package ej1;

/**
 *
 * @author alejandro
 */
public class Ej1 {
//*****************************************************************************
//----------------------------Métodos------------------------------------------
//*****************************************************************************

    static void iniciarMatriz(int m[][]) {
        //Variables
        int n;

        //Inicio
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                n = (int) (Math.random() * 10 + 1);
                m[i][j] = n;
            }
        }
    }

    static void sumarMatriz(int m1[][], int m2[][], int r[][]) {
        //Inicio
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                r[i][j] = m1[i][j] + m2[i][j];
            }
        }
    }
    
    static int [][] sumarMatriz2(int m1[][], int m2[][]) {
        int r[][] = new int[m1.length][m1[0].length];
        //Inicio
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                r[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return r;
    }

    static void mostrarMatriz(int m[][]){
        //Inicio
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }
    
//*****************************************************************************
//---------------------------Principal-----------------------------------------
//*****************************************************************************
    public static void main(String[] args) {
        //Variables
        int op1[][] = new int[3][3];
        int op2[][] = new int[op1.length][op1[0].length];
        int resultado[][] = new int[op1.length][op1[0].length];

        //Inicio
        iniciarMatriz(op1);
        iniciarMatriz(op2);
        //sumarMatriz(op1, op2, resultado);
        resultado = sumarMatriz2(op1, op2);
        System.out.println("Matriz 1:");
        mostrarMatriz(op1);
        System.out.println("Matriz 2:");
        mostrarMatriz(op2);
        System.out.println("Resultado:");
        mostrarMatriz(resultado);
    }

}
