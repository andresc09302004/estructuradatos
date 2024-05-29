/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_bimestre1;

import java.util.Random;

public class NotasClase_eje8 {
    public static void main(String[] args) {
        // Declarar variables
        int numEstudiantes = 20;
        int numAsignaturas = 4;
        int[][] notas = new int[numEstudiantes][numAsignaturas];
        
        // Generar aleatoriamente las notas de cada estudiante para cada asignatura
        generarNotasAleatorias(notas);
        
        // Calcular la media de cada alumno
        double[] mediasAlumnos = calcularMediasAlumnos(notas);
        
        // Calcular la media de cada asignatura
        double[] mediasAsignaturas = calcularMediasAsignaturas(notas);
        
        // Calcular la media de toda la clase
        double mediaClase = calcularMediaClase(notas);
        
        // Mostrar resultados
        System.out.println("Media de cada alumno:");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + mediasAlumnos[i]);
        }
        
        System.out.println("\nMedia de cada asignatura:");
        for (int i = 0; i < numAsignaturas; i++) {
            System.out.println("Asignatura " + (i + 1) + ": " + mediasAsignaturas[i]);
        }
        
        System.out.println("\nMedia de toda la clase: " + mediaClase);
    }
    
    // Método para generar notas aleatorias para cada estudiante y asignatura
    public static void generarNotasAleatorias(int[][] notas) {
        Random random = new Random();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = random.nextInt(11); // Genera números aleatorios entre 0 y 10
            }
        }
    }
    
    // Método para calcular la media de cada alumno
    public static double[] calcularMediasAlumnos(int[][] notas) {
        double[] medias = new double[notas.length];
        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            medias[i] = (double) suma / notas[i].length;
        }
        return medias;
    }
    
    // Método para calcular la media de cada asignatura
    public static double[] calcularMediasAsignaturas(int[][] notas) {
        double[] medias = new double[notas[0].length];
        for (int j = 0; j < notas[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            medias[j] = (double) suma / notas.length;
        }
        return medias;
    }
    
    // Método para calcular la media de toda la clase
    public static double calcularMediaClase(int[][] notas) {
        int totalNotas = notas.length * notas[0].length;
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
        }
        return (double) suma / totalNotas;
    }
}
