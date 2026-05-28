
package tp4.ejercicio.n4;

import java.util.Scanner;


public class TP4EJERCICION4 {

   
    public static void main(String[] args) {
      
        
        
    Scanner sc = new Scanner(System.in);

        int cantidad;
        double suma = 0;
        double media;

        // Se pide la cantidad de alumnos
        System.out.println("Ingrese la cantidad de alumnos: ");
        cantidad = sc.nextInt();

        
        
        // Se crea un array para guardar las notas
        double[] notas = new double[cantidad];

        
        
        // Primer recorrido: cargar notas
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        
        
        // Segundo recorrido: calcular suma
        for (int i = 0; i < cantidad; i++) {
            suma += notas[i];
        }

        // Se calcula el promedio
        media = suma / cantidad;

        System.out.println("La nota media del grupo es: " + media);

        
        
        // Tercer recorrido: mostrar notas superiores al promedio 
        System.out.println("Alumnos con notas superiores al promedio:");

        for (int i = 0; i < cantidad; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + " ---> Nota: " + notas[i]);
            }
        }

        
    }
    
}
