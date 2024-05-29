/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_bimestre1;

/**
 *
 * @author A S U S
 */
public class NumerosPrimos_eje5 {
    
    public static void main(String[] args) {
        int n = 10; // Número de números primos a mostrar
        
        // Mostrar los números primos
        System.out.println("Numeros primos:");
        for (int i = 0; i < n; i++) {
            System.out.print(obtenerPrimo(i) + " ");
        }
    }
    
    // Método para obtener el número primo en la posición dada
    public static int obtenerPrimo(int posicion) {
        int contador = 0;
        int numero = 1;
        
        while (contador <= posicion) {
            numero++;
            if (esPrimo(numero)) {
                contador++;
            }
        }
        
        return numero;
    }
    
    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
