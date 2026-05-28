import java.util.Scanner;


public class TP4EJERCICION1 {

    public static void main(String[] args) {
        
        
             
Scanner sc = new Scanner(System.in);
 
int vector [] = new int[7];
     
for (int i = 0; i < 7; i++) {
    System.out.println("Ingrese un numero: ");
    vector[i] = sc.nextInt();
}


System.out.println("Los numeros ingresados son: ");
for (int i = 0; i < 7; i++) {
    System.out.println(vector[i]);
}
         
    }
    
}
