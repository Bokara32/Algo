import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Ouverture du Scanner */

         Scanner scan = new Scanner(System.in);

         /* Définition des valeurs */

         int vsaisie ;

         int vzero = 1 ; 

         int calcul; 

         System.out.print(" \n ");

         System.out.print(" Saisissez l'entier de Départ \n ");

         /* Recuperation de la Valeur vsaisie */

         vsaisie = scan.nextInt(); 

         
         for (int i = vzero; i < vsaisie; i++) { calcul = i + vsaisie; System.out.print(calcul);
            
         }


         
         


         
    }
}
