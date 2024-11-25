import java.util.Scanner;

public class App

 {
    public static void main(String[] args) throws Exception 
    
    {
        
         /* Et le plus grand est ... */

         /* Ouverture du Scanner  */

         Scanner scan = new Scanner(System.in);

         /* Définition des valeurs et Déclaration du tableau */

         int longeurTab = 9999; 
         
         int valsc []= new int[longeurTab ]; 
         
         /* Déclaration de la valeur de recherche max */
         
         int stocksc = 0; 

         int maxVal = Integer.MIN_VALUE;

         int pmaxVal = 0 ;
        
         /* Déclaration de l'entier d'iteration*/
        
         int vali = 0; 

              System.out.print( " Entrer 20 nombres entier et je dirai quel est le plus grand,  pour arreter la saisie entrer 0   \n " );
        
         do { System.out.print( " Entrer la valeur : " + (vali+1) + "\n");
            
         /* Intégration de la valeur dans le tableau */
         
             valsc[vali] = stocksc = scan.nextInt(); 

             vali++; 
             
            } 
       
         /* Condition de la boucle */

         while (stocksc > 0 && vali < longeurTab ); 

         /* Condition de Calcul */

         for (int i = 0; i < valsc.length; i++) if( valsc[i]> maxVal ) {maxVal = valsc[i]; pmaxVal = i;}

         /* Affichage du resultat */
         
         System.out.print("\n" + " La plus grande valeur est : " + maxVal +  " en " + pmaxVal + " Position ");
         
         /* Fermeture du Scanner */
         
         scan.close();

        
    }
       
 }
       
 
    
