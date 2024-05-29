
package tarea_bimestre1;

public class Factorial_eje3 {
    public static void main(String[] args) {
        // Arreglo A con los 10 números
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Arreglo B para almacenar los factoriales
        long[] B = new long[10];
        
        // Calcular los factoriales de los números en A y almacenarlos en B
        for (int i = 0; i < A.length; i++) {
            B[i] = calcularFactorial(A[i]);
        }
        
        // Mostrar los factoriales almacenados en B
        System.out.println("Factoriales de los números en A:");
        for (int i = 0; i < B.length; i++) {
            System.out.println("Factorial de " + A[i] + ": " + B[i]);
        }
    }
    
    // Método recursivo para calcular el factorial de un número
    public static long calcularFactorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }
}
