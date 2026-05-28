
package tp4.ejercicio.n6;

import java.util.Scanner;


public class TP4EJERCICION6 {

    
    public static void main(String[] args) {
         
        
Scanner sc = new Scanner(System.in);

    
        int[] numeros = new int[10];

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

     
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }

    
        for (int i = 0; i < 10; i++) {

            if (numeros[i] > 0) {
                positivos++;
            } 
            else if (numeros[i] < 0) {
                negativos++;
            } 
            else {
                ceros++;
            }
        }

    
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);


    }
    
}
