/*

*/
package victoria;

import java.util.Scanner;
import java.util.Random;
public class JuegoParesNones {

   
    public static void main(String[] args) {
       //objeto de clase tipo escanner
       
       Scanner teclado= new Scanner(System.in);
       
       //objeto de clase tipo random
        
        Random NumAleatorio = new Random();
        
        
        //DEFINO VARIABLES A USAR---------------------------
        
        String opcion = null;
        
        int NumPares, NumNones;
        
        boolean esNones; //luego le doy valor en el if-else
        
        //constantes
        final int MAX_VALUE = 10; 
        final int MIN_VALUE = 1;
        
        //-----------------MENU--------------------------
        do { //repetir el bucle hasta que yo no le diga salir.

           do {
               //MENÚ DE OPCIONES QUE VISUALIZA EL USER
               System.out.println("\n-------------------------\n"
                       + "Vamos a jugar a un juego. Elija modalidad de juego:");
               System.out.println("1. Modalidad Manual");
               System.out.println("2. Modalidad juega con la máquina");
               System.out.println("3. Salir dle juego ");

            } //end do2
           while (opcion == "1" || opcion == "2");

            

            //realizar las operaciones  
        }//end do1
        while (!opcion.equals("3"));
        
        
    }
    
}
