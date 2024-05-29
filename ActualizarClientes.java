/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_bimestre1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActualizarClientes {
    public static void main(String[] args) {
        try {
            // Verificar si el archivo original existe
            File archivoOriginal = new File("Deudas.txt");
            if (!archivoOriginal.exists()) {
                // Crear el archivo si no existe
                archivoOriginal.createNewFile();
                System.out.println("Se ha creado el archivo 'Deudas.txt'.");
            }

            // Archivo para guardar la información actualizada
            File archivoActualizado = new File("ClientesActualizados.txt");
            FileWriter escritor = new FileWriter(archivoActualizado);

            // Leer el archivo original
            Scanner scanner = new Scanner(archivoOriginal);

            // Iterar sobre cada línea del archivo original
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] datos = linea.split(",");
                String nombreCliente = datos[0];
                double deuda = Double.parseDouble(datos[1]);
                int añosSinPagar = Integer.parseInt(datos[2]);
                String estado = datos[3];

                // Verificar si el cliente cumple con las condiciones
                if (estado.equals("Central de Riesgo") && deuda < 500 && añosSinPagar >= 3) {
                    // Cambiar el estado del cliente a "Liberado"
                    estado = "Liberado";
                    System.out.println("El cliente " + nombreCliente + " ha sido liberado.");
                }

                // Escribir la información actualizada en el archivo
                escritor.write(nombreCliente + "," + deuda + "," + añosSinPagar + "," + estado + "\n");
            }

            // Preguntar si desea agregar más clientes
            Scanner input = new Scanner(System.in);
            System.out.print("¿Desea agregar más clientes? (s/n): ");
            String respuesta = input.nextLine();
            while (respuesta.equalsIgnoreCase("s")) {
                System.out.print("Ingrese el nombre del cliente: ");
                String nuevoCliente = input.nextLine();
                System.out.print("Ingrese la deuda del cliente: ");
                double nuevaDeuda = Double.parseDouble(input.nextLine());
                System.out.print("Ingrese los años sin pagar del cliente: ");
                int nuevosAñosSinPagar = Integer.parseInt(input.nextLine());
                // Agregar al archivo
                escritor.write(nuevoCliente + "," + nuevaDeuda + "," + nuevosAñosSinPagar + ",Central de Riesgo\n");
                System.out.print("¿Desea agregar otro cliente? (s/n): ");
                respuesta = input.nextLine();
            }

            // Cerrar recursos

            System.out.println("Clientes actualizados con éxito.");

        } catch (IOException e) {
            System.out.println("Error: " );
        }
    }
}
