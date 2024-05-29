
package tarea_bimestre1;
import java.util.Scanner;

public class VerificarOrden_eje6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el tamaño del arreglo
        System.out.print("Ingrese el tamano del arreglo: ");
        int n = scanner.nextInt();
        
        // Crear un arreglo para almacenar los números
        int[] arreglo = new int[n];
        
        // Pedir al usuario que ingrese los números del arreglo
        System.out.println("Ingrese los numeros del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }
        
        // Verificar si el arreglo está ordenado
        if (estaOrdenado(arreglo)) {
            System.out.println("El arreglo está ordenado.");
        } else {
            System.out.println("El arreglo no está ordenado.");
        }

    }
    
    // Método para verificar si un arreglo está ordenado
    public static boolean estaOrdenado(int[] arreglo) {
        // Verificar si el arreglo está ordenado de manera ascendente
        boolean ascendente = true;
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                ascendente = false;
                break;
            }
        }
        
        // Verificar si el arreglo está ordenado de manera descendente
        boolean descendente = true;
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] < arreglo[i + 1]) {
                descendente = false;
                break;
            }
        }
        
        // El arreglo está ordenado si está en orden ascendente o descendente
        return ascendente || descendente;
    }
}
