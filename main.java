package cricket;

/**
 *
 * @author Pedro
 */
import java.util.*;

public class cricket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0, contador = 0, puntuacion = 0, longitud = 0, global = 0, doble, triple;

        //Arrays para controlar rondas y dardos        
        int[] ronda = new int[contador];
        int[] dardo = new int[longitud];

        //bucle de rondas     
        for (contador = 0; contador < 26; contador++) {
            System.out.println("Ronda: " + (contador + 1) + " adelante!");
            System.out.println("");
            System.out.println("Introduzca la puntuacion de esta ronda: ");

            //bucle de dardos 
            for (longitud = 0; longitud < 3; longitud++) {
                System.out.println("");
                System.out.println("Dardo: " + (longitud + 1));
                puntuacion = sc.nextInt();

            //switch donde se descartan los dardos que no puntúan, los dardos del 0 al 14 y del 21 al 24
                switch (puntuacion) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        global = 0;
                        break;
                    case 15:
                        global += 15;
                        break;
                    case 16:
                        global += 16;
                        break;
                    case 17:
                        global += 17;
                        break;
                    case 18:
                        global += 18;
                        break;
                    case 19:
                        global += 19;
                        break;
                    case 20:
                        global += 20;
                        break;
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        global = 0;
                        break;
                    case 25:
                        System.out.println(" ¿Es doble? / 1=NO, 2=SI");
                        doble = sc.nextInt();
                        if (doble == 1) {
                            global+= 25;
                        doble=0;                            
                        } else 
                            global+= 50;
                        doble=0;
                        break;
                }

                //bucle que controla el valor de cada dardo        
                while (puntuacion < 0 || puntuacion > 25) {
                    System.out.println("Error, con un dardo no se puede lograr esa puntuación");
                    System.out.println("");
                    System.out.println("Vuelva a introducir la puntuación para el dardo " + (longitud + 1) + ":");
                    puntuacion = sc.nextInt();
                }

            }
            System.out.println("LLevas: " + global + " puntos");
        }
    }

}