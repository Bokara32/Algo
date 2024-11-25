import java.util.Scanner;

public class App 

{
    public static void main(String [] args) throws Exception 
    
    {
        /* ouverture du Scanner */
        
         Scanner scan = new Scanner(System.in);

         /* Définition des variables du tableau */

         int vtab = 9999;

         double somme = 0.0;
         
         double vstock = 0.0;

         double calculBdc = 0.0;

         int vali = 0; 

         /* Creation du Tableau */

         double [] Prix = new double[vtab];

         System.out.print( "\n Entrer le prix des articles choisis \n " );

         /* Accrémentation des valeurs */
        
         do { System.out.print( " Entrer le prix de l'article : " + (vali+1) + "\n");

             Prix[vali] = vstock = scan.nextDouble(); 

             vali++;
           
            }

         while (vali < vtab && vstock != 0); for (double i : Prix) { somme = somme + i ; }

         

         System.out.print( "\n\n" + calculBdc);

         /* Texte d'information */

         System.out.print(" La somme des articles à regler est de : " + somme + " Euros ");




        
    }
}
