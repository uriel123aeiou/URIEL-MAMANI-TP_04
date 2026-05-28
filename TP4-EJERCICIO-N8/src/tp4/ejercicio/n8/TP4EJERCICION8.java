
package tp4.ejercicio.n8;

import java.util.Scanner;


public class TP4EJERCICION8 {

   
    public static void main(String[] args) {
       
       
Scanner sc = new Scanner(System.in);


String[] nombres = new String[20];
double[] sueldos = new double[20];


for (int i = 0; i < 20; i++) {
    System.out.println("Empleado " + (i + 1));

    System.out.println("Nombre: ");
    nombres[i] = sc.nextLine();

    System.out.println("Sueldo: ");
    sueldos[i] = sc.nextDouble();
    sc.nextLine();
    }

     
        double mayorSueldo = sueldos[0];
        String nombreMayor = nombres[0];

        for (int i = 1; i < 20; i++) {
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = nombres[i];
            }
        }

      
        System.out.println("Empleado que mas gana:");
        System.out.println("Nombre: " + nombreMayor);
        System.out.println("Sueldo: " + mayorSueldo);
  }
}