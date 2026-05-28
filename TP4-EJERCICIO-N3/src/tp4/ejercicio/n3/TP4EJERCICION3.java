
package tp4.ejercicio.n3;

import java.util.Scanner;


public class TP4EJERCICION3 {

    
    public static void main(String[] args) {
      
        
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];


        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        int Suma = 0;
        int cant = 0;


        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                Suma += numeros[i];
                cant++;
            }
        }
        System.out.println("Media de posiciones pares: " + (double) Suma / cant);
     
    }
    
}
