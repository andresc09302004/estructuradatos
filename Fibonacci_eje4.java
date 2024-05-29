/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_bimestre1;

/**
 *
 * @author A S U S
 */
public class Fibonacci_eje4 {
    public static void main(String[] args) {
        int n = 10; // Número de términos de la serie de Fibonacci a mostrar
        
        // Mostrar la serie de Fibonacci
        System.out.println("Serie de Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    // Método recursivo para calcular el número de Fibonacci de un índice dado
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
