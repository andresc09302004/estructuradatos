/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_bimestre1;

import java.util.Scanner;

public class SumaParesImpares_eje7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese la cantidad de elementos en la lista
        System.out.print("Ingrese la cantidad de elementos en la lista: ");
        int n = scanner.nextInt();
        
        // Crear un arreglo para almacenar los elementos
        int[] lista = new int[n];
        
        // Pedir al usuario que ingrese los elementos de la lista
        System.out.println("Ingrese los elementos de la lista:");
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
        }
        
        // Calcular la suma de números pares e impares
        int sumaPares = 0;
        int sumaImpares = 0;
        for (int numero : lista) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }
        
        // Mostrar la suma de números pares e impares
        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de números impares: " + sumaImpares);
        
        
    }
}
