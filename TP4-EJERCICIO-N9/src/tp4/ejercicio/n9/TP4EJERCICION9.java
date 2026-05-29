package tp4.ejercicio.n9;

import java.util.Scanner;

public class TP4EJERCICION9 {

   
    public static void main(String[] args) {
      
        
   Scanner sc = new Scanner(System.in);

  
        boolean[] pagos = new boolean[10];

        int pagaron = 0;
        int deudores = 0;

        
  
        for (int i = 0; i < 10; i++) {
            System.out.println("Alumno " + (i + 1));
            System.out.println("Pago la cuota? (true/false): ");
            pagos[i] = sc.nextBoolean();

            if (pagos[i]) {
                pagaron++;
            } else {
                deudores++;
            }
        }

        double porcentaje = (pagaron * 100.0) / 10;

        System.out.println("Cantidad de pagos: " + pagaron);
        System.out.println("Cantidad de deudores: " + deudores);
        System.out.println("Porcentaje de cobranza: " + porcentaje + "%");
     
  }
}     