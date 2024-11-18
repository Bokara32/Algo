import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

      /* Ouverture du scanner */

      Scanner scan= new Scanner(System.in);

      /* Déclaration de la valeur Vide */

      int nombreS = 0;

      /* Déclaration des instructions de boucle */
      
       do { System.out.print(" Saisissez une Valeur entre 10 et 20 \n \n ");

          nombreS = scan.nextInt(); 

          /* Condition est affichage */

          if ( nombreS< 10){ System.out.print(" Chiffre saisi inférieur à 10 Saisissez un chifre plus grand !");}
    
          else if (nombreS > 20){System.out.print( " Chiffre saisi supérieur à 20 Saisissez un chiffre plus petit ! ");}
    
          else if (nombreS <17 && nombreS >=10){System.out.print(" Le chiffre à trouver est plus grand ! "); }
    
          else if (nombreS > 17 && nombreS <=20){ System.out.print(" Le Chiffre à trouver est plus petit ! ");} 

          /* Condition de la boucle */

        } while (nombreS != 17); 

          if (nombreS == 17){ System.out.print(" Yes, you did it !! ");}

          /* Fermeture du Scanner */

          scan.close();


    }
}
