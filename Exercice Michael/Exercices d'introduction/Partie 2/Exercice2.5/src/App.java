import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Ouverture du Scanner */

        Scanner scan = new Scanner(System.in);

        System.out.print("\n \n");

        System.out.print( " Saisissez une Année \n \n ");

        /* Incrémentation de La valeur */
        
        int ValeurAnnee = scan.nextInt();

        System.out.print( "\n \n ");

        /* Si la valeur est divisible par 4 mais pas par 100 ou divisible par 400 */

        if ( ValeurAnnee % 4 == 0  && (ValeurAnnee % 100 > 0 || ValeurAnnee % 400 == 0 )) { System.out.print( "L'année : " + ValeurAnnee + " est une Année Bisextiles "); }

        else {  System.out.print( " L'année : " + ValeurAnnee + " est une Année Normal ") ;}

        /* Fermeture du Scanner */

        scan.close();
            
        

  





    

    }
}
