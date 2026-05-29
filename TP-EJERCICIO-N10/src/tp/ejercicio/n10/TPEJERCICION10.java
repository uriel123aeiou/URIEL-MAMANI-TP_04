package tp.ejercicio.n10;

import java.util.Random;

public class TPEJERCICION10 {

    
    
//------------------------------------------------------------------------------
static int[] RellenarArray( int[] Array ){
        Random Aleatorio = new Random();
        
        for(int contador = 0; contador < Array.length; contador++){
            int numero_nuevo = Aleatorio.nextInt(15);
            
            if(comprobarSiContiene(Array, contador, numero_nuevo) == false){
                Array[contador] = numero_nuevo;
            }
        }
        
        return Array;
    }

//------------------------------------------------------------------------------
public static void main(String[] args) {
    

    int[] Vector = new int[5];
    
    Vector = RellenarArray(Vector);
    
    for(int contador = 0; contador < Vector.length; contador++){
        System.out.println(Vector[contador]);
    }

  
  }
//------------------------------------------------------------------------------
static boolean comprobarSiContiene(int[] Array, int pos, int nuevo_num){
    boolean contiene = false;
    Random Aleatorio = new Random();
    
    for(int i = 0; i < Array.length; i++){
        if(Array[i] == nuevo_num){
        
            return true;
        }
    }
    
    
    return contiene;
}


}





    
 



    





