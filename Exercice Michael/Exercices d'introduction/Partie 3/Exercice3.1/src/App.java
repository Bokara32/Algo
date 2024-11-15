import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Ouverture du Scanner et identification de la saisie */

        int valeurN = Integer.MIN_VALUE;
       
        Scanner scan = new Scanner (System.in);

        /* définition de la boucle */
        
      do { 
           System.out.print("\n ");
        
           System.out.print( " Saisissez un Nombre Compris entre 1 et 3 \n ");

             valeurN = scan.nextInt(); 

         if (valeurN != 2) {System.out.print(" Essayer Encore !!! \n \n " );} 

         /* Condition de la boucle  */

         } while (valeurN != 2); 

         /* Reponse selon résultat */

         if (valeurN == 2) { System.out.print( " Bravo vous avez réussi "); }
            
         scan.close();
         
       
    
        
            
    }
}
