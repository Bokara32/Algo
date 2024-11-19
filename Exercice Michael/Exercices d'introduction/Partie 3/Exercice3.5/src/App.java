import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Exercice 3.5 la Factorielle */

         Scanner scan = new Scanner(System.in);

         /* Définition des valeurs */

         int vsaisie ;

         int ite = 1 ; 
         
         int fact = 1 ;

         System.out.print(" \n ");

         System.out.print(" Saisissez l'entier de Départ \n ");

         /* Recuperation de la Valeur vsaisie */

         vsaisie = scan.nextInt(); 

         /* Calcul logique de la suite d'addition */
         
         for  (ite = 1; ite <= vsaisie; ite++) { fact = fact * ite; }

         System.out.print( " Le Résultat de la Factorielle de : " + vsaisie + " est : " + fact );

         /* Fermeture du Scanner */

         scan.close();
    }
}
