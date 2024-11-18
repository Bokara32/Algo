import java.util.Scanner;

public class exo_33 {
    public static void main(String[] args) throws Exception {

        /* Ouverture du Scanner */

         int nombre;
         
         int calcul;
         
         Scanner scan = new Scanner(System.in);

         System.out.print( " Programme de calcul des 10 Prochains nombres \n " + " Saisissez un nombre Entier \n ");
         
         /* Inscription de la valeur départ */
         
         nombre = scan.nextInt(); 
         
         System.out.print( " Les 10 nombres après " + nombre + " Sont : \n ");

         /* Calcul et condition de la boucle */
         
         calcul = nombre + 10;

         for (int i = nombre +1 ; i <= calcul; i++) 

         /* Pour enlever la dérnière virgule */
         
         if ( i < calcul){System.out.print(i + ",");}

         else {System.out.print(i);}

         /* Fin du Scanner */

         scan.close();
            
         
            
         
 


    }
}
