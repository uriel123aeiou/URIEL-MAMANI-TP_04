
package tp4.ejercicio.n7;


public class TP4EJERCICION7 {

   
    public static void main(String[] args) {
    
        
int [] vector = new int [10];
int i = 0;
    
    while (i < 10){
    vector[i] = (int)(Math.random() * (100 - 0 + 1) + 0);
i++;
        }
System.out.println("Los numeros aleatorios son:");

    for (int a = 0; a < 10;a++){
            System.out.println(vector[a]);
        }

    }
    
}
