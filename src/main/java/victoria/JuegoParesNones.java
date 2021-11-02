/*

URL DEL REPOSITORIO EN GITHUB. 
url: https://github.com/Victoria-Sampalo/JuegoPanesNones.git
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
        
        String opcion;
        String optJ1, optJ2;
       
        
        int NumPares, NumNones;
        
        boolean esNones; //luego le doy valor en el if-else
        
        //constantes
        final int MAX_VALUE = 10; 
        final int MIN_VALUE = 0;
        
        //-----------------MENU--------------------------
        do { //repetir el bucle hasta que yo no le diga salir.

           do {
               //MENÚ DE OPCIONES QUE VISUALIZA EL USER
               System.out.println("\n-------------------------\n"
                       + "Vamos a jugar a un juego. Elija modalidad de juego:");
               System.out.println("1. Modalidad Manual");
               System.out.println("2. Modalidad juega con la máquina");
               System.out.println("3. Salir dle juego ");
               System.out.println("Ha elegido la opción: ");
               
               //pido dato al user de su opcion
               opcion = teclado.nextLine();
            } //end do2
           while (!opcion.equals("1") && !opcion.equals("2") );
            //estructura de while en string (!opcion.equals() &&...);
         
           switch (opcion){
             
               case "1": 
                   System.out.println("1. MODALIDAD MANUAL\n-----------\n");
                   
                   //solicito si el jugador 1 elige ser PAR O NONES
                   System.out.println("Jugador 1-Introduzca si quiere ser pares (p) o nones (n)");
                   
                   optJ1 = teclado.nextLine();
                   
                   //do-while para los datos en string del jugador 1
                   do {
                    
                       
                     //me meto en la condicion if else para el primer case
                   
                   
                   
                   } while (!optJ1.equals("p") && !optJ1.equals("P") && !optJ1.equals("n") 
                           && !optJ1.equals("N"));
                   
                   
                   
                break;
          
           
               case "2":
                   System.out.println("2.MODALIDAD CONTRA LA MAQUINA\n-----------\n");
                   
                break;
                
               default:
                break;
                
                   
           }//end witch
       
        }//end do1
        while (!opcion.equals("3"));
        
        
    }
    
}
