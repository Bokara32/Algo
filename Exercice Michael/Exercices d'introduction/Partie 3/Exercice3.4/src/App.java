import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Ouverture du Scanner */

         Scanner scan = new Scanner(System.in);

         /* Définition des valeurs */

         int vsaisie ;

         int vzero = 0 ; 

         int calcul;

         int Resultat = 0 ;

         System.out.print(" \n ");

         System.out.print(" Saisissez l'entier de Départ \n ");

         /* Recuperation de la Valeur vsaisie */

         vsaisie = scan.nextInt(); 

         /* Calcul logique de la suite d'addition */
         
         for (int i = vzero; i <= vsaisie; i++) { calcul= i+i; Resultat = vsaisie + calcul; } 
            
         System.out.print( " Le Résultat de la suite d'addition est : " + Resultat );

         /* Fermeture du Scanner */

         scan.close();

         


         
         


         
    }
}
