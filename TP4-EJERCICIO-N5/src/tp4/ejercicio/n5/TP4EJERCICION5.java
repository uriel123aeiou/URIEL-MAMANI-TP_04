
package tp4.ejercicio.n5;


public class TP4EJERCICION5 {

    
    public static void main(String[] args) {
      
       
        int[] pares = new int[20];

        
        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

      
        System.out.println("Contenido del array:");

        for (int i = 0; i < pares.length; i++) {
            System.out.println("Posicion " + i + ": " + pares[i]);
        }

        
    }
    
}
