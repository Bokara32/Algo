import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
         /* Et le plus grand est ... */

         /* Ouverture du Scanner  */

         Scanner scan = new Scanner(System.in);

         /* Définition des valeurs et Déclaration du tableau */
         
         int valsc []= new int[5]; 
         
         /* Déclaration de la valeur de recherche max */
         
         int maxVal = Integer.MIN_VALUE;

         int pmaxVal = 0 ;
        
         /* Déclaration de l'entier d'iteration*/
        
         int vali = 0; 

              System.out.print( " Entrer 20 nombres entier et je dirai quel est le plus grand \n " );
        
         do { System.out.print( " Entrer la valeur : " + (vali+1) + "\n");

             valsc[vali] = scan.nextInt(); 

             vali++; }

             
         while (vali < 5); 

         for (int i = 0; i < valsc.length; i++) { if (valsc[i]> maxVal) maxVal = valsc[i]; pmaxVal = i;
            
         }
         System.out.print("\n" + " La plus grande valeur est : " + maxVal +  " en " + pmaxVal + " Position ");

         scan.close();



    }
}
