/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_bimestre1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HistorialMedico {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);

            // Pedir la cantidad de pacientes
            System.out.print("Ingrese la cantidad de pacientes: ");
            int cantidadPacientes = input.nextInt();
            input.nextLine(); // Limpiar el buffer de entrada

            // Crear el archivo para guardar el historial médico
            File archivoHistorial = new File("HistorialMedico.txt");
            FileWriter escritor = new FileWriter(archivoHistorial);

            // Iterar para ingresar la información de cada paciente
            for (int i = 0; i < cantidadPacientes; i++) {
                // Pedir la información del paciente
                System.out.println("\nIngresando información del paciente " + (i + 1) + ":");
                System.out.print("Cédula de identidad: ");
                String cedula = input.nextLine();
                System.out.print("Apellidos Completos: ");
                String apellidos = input.nextLine();
                System.out.print("Nombres completos: ");
                String nombres = input.nextLine();
                System.out.print("Fecha de nacimiento: ");
                String fechaNacimiento = input.nextLine();
                System.out.print("Estatura: ");
                String estatura = input.nextLine();
                System.out.print("Peso: ");
                String peso = input.nextLine();
                System.out.print("Alergias: ");
                String alergias = input.nextLine();

                // Escribir la información del paciente en el archivo
                escritor.write("Paciente " + (i + 1) + ":\n");
                escritor.write("Cédula de identidad: " + cedula + "\n");
                escritor.write("Apellidos Completos: " + apellidos + "\n");
                escritor.write("Nombres completos: " + nombres + "\n");
                escritor.write("Fecha de nacimiento: " + fechaNacimiento + "\n");
                escritor.write("Estatura: " + estatura + "\n");
                escritor.write("Peso: " + peso + "\n");
                escritor.write("Alergias: " + alergias + "\n\n");
            }

            escritor.close();
            System.out.println("\nHistorial médico creado con éxito.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
