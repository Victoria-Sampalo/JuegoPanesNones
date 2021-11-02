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

        Scanner teclado = new Scanner(System.in);

        //objeto de clase tipo random
        Random numAleatorio = new Random();

        //DEFINO VARIABLES A USAR---------------------------
        String opcion;
        String optJ1;
        int numJ1, numJ2, sumaNumeros, sumaAleatorio;

        int numRandom;
        boolean esPar = false; //luego le doy valor en el if-else

        //constantes
        final int MAX_VALUE = 10;
        final int MIN_VALUE = 0;

        //-----------------MENU--------------------------
        do { //repetir el bucle hasta que yo no le diga salir.

            do {
                //MENÚ DE OPCIONES QUE VISUALIZA EL USER
                System.out.println("\n----------JUEGO-PARES-O-NONES----------\n"
                        + "Vamos a jugar a un juego. Elija una de las siguientes opciones:");
                System.out.println("1. Modalidad manual");
                System.out.println("2. Modalidad juega con la máquina");
                System.out.println("3. Salir del juego \n---------------------\n");

                //pido dato al user de su opcion
                opcion = teclado.nextLine();

            } //end do2
            while (!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3"));
            //estructura de while en string (!opcion.equals() &&...);

            switch (opcion) {

                case "1":
                    System.out.println("Has elegido la opción\n1. MODALIDAD MANUAL\n-----------\n");

                    //do-while para los datos en string del jugador 1
                    do {

                        //solicito si el jugador 1 elige ser PAR O NONES
                        System.out.println("Jugador 1-Introduzca si quiere ser pares (p) o nones (n)");

                        optJ1 = teclado.nextLine();
                        //  System.out.println("El jugador 1 ha elegido " +  optJ1);
                        //en función de la elección de jugador 1, el jugador 2 será

                        switch (optJ1) {
                            //opcion PARES
                            case "P":
                            case "p":
                                System.out.println("Jugador 1. Has elegido ser PARES\n"
                                        + "Jugador 2. Eres NONES");
                                esPar = true;
                                break;
                            //opcion NONES 
                            case "n":
                            case "N":
                                System.out.println("Jugador 1. Has elegido ser NONES\n"
                                        + "Jugador 2. Eres PARES");
                                esPar = false;
                                break;

                            default:
                                System.out.println("opción no válida, intentalo de nuevo");
                                break;
                        }//end switch.optJ1

                        //solicito los números a jugar a ambos jugadores
                        //jugador 1
                        do {
                            System.out.println("Jugador 1: \nIntroduzca un número del 1 al 10");
                            numJ1 = teclado.nextInt();

                            System.out.println("Jugador 1- Has elegido el número: " + numJ1);
                            break; //break para que no me pida el número infinitas veces, no se como salir del bucle
                        } while (numJ1 < 0 || numJ1 < 10); //condición siempre entre 0 y 10

                        //jugador 2
                        do {
                            System.out.println("Jugador 2: \nIntroduzca un número del 1 al 10");
                            numJ2 = teclado.nextInt();

                            System.out.println("Jugador 2- Has elegido el número: " + numJ2);
                            break;
                        } while (numJ2 < 0 || numJ2 < 10);

                        //------------OPERO----------------
                        //Realizo cálculos 
                        sumaNumeros = numJ1 + numJ2;
                        System.out.println("La suma de ambos números es: " + sumaNumeros + " ,por lo tanto: ");

                        //condición if else para ver resultado y ganador
                        if (sumaNumeros % 2 == 0) {
                            System.out.println("Gana la opción PAR");
                            if (esPar == true) {
                                System.out.println("JUGADOR 1 ENHORABUENA HAS GANADO");
                            } else {
                                System.out.println("JUGADOR 2 ENHORABUENA HAS GANADO");
                            }
                        } else {
                            System.out.println("Gana la opción NONES");

                            if (esPar == false) {
                                System.out.println("JUGADOR 1 Ohh que pena has perdido. Pide la revancha");
                            } else {
                                System.out.println("JUGADOR 2 Ohh que pena has perdido. Pide la revancha");
                            }
                        }

                    } while (!optJ1.equals("p") && !optJ1.equals("P") && !optJ1.equals("n")
                            && !optJ1.equals("N"));

                    break;

                case "2":
                    System.out.println("Has elegido la opción\n2.MODALIDAD CONTRA LA MÁQUINA\n-----------\n");
                    do {
                        //solicito si el jugador 1 elige ser PAR O NONES
                        System.out.println("Jugador 1-Introduzca si quiere ser pares (p) o nones (n)");
                        //guardo dato introducido
                        optJ1 = teclado.nextLine();

                        //switch opciones posibles de optJ1
                        switch (optJ1) {
                            //opcion PARES
                            case "P":
                            case "p":
                                System.out.println("Jugador 1. Has elegido ser PARES\n"
                                        + "La máquina juega con NONES");
                                esPar = true;
                                break;
                            //opcion NONES 
                            case "n":
                            case "N":
                                System.out.println("Jugador 1. Has elegido ser NONES\n"
                                        + "La máquina juega con PARES");
                                esPar = false;
                                break;

                            default:
                                System.out.println("opción no válida, intentalo de nuevo");
                                break;
                        }//end switch.optJ1 case 2

                        //solicito al jugador 1 su número 
                        //jugador 1
                        do {
                            System.out.println("Jugador 1: \nIntroduzca un número del 1 al 10");
                            numJ1 = teclado.nextInt();

                            System.out.println("Jugador 1- Has elegido el número: " + numJ1);
                            break; //break para que no me pida el número infinitas veces, no se como salir del bucle
                        } while (numJ1 < 0 || numJ1 < 10); //condición siempre entre 0 y 10

                        //genero un número aleatorio de la máquina, rango de 0 a 10. Uso clase random
                        //estructura (max - min + 1) + min 
                        numRandom = numAleatorio.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;

                        System.out.println("La máquina ha elegido el:  " + numRandom);

                         //------------OPERO--------------
                        //realizo los cálculos 
                        sumaAleatorio = numJ1 + numRandom;
                        System.out.println("La suma de ambos números es " + sumaAleatorio + " ,por lo tanto:");

                        //oncidición if else para ver resultado del ganador
                        if (sumaAleatorio % 2 == 0){
                            System.out.println("Gana la opción PAR");
                            if(esPar == true){
                                System.out.println("JUGADOR 1 ENHORABUENA HAS GANADO");
                                
                            } else { System.out.println("LA MÁQUINA HA GANADO");}
                        }
                        else {
                            System.out.println("Gana la opción IMPAR");
                            if (esPar ==false){
                                System.out.println("JUGADOR 1 Ohh que pena has perdido con una máquina. Pide la revancha");
                            } else {System.out.println("Has vencido a la máquina");}
                        } 
                        
                    }//end do1 case2
                    while (!optJ1.equals("p") && !optJ1.equals("P") && !optJ1.equals("n")
                            && !optJ1.equals("N"));

                    break;

                case "3":
                    System.out.println("Has elegido la opción\n3. SALIR DEL JUEGO. ¡HASTA LA PRÓXIMA!\n-----------\n");

                    break;

            }//end switch

        }//end do1
        while (!opcion.equals("3"));

    }

}
