import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Définir Le Type de calcul */

         System.out.print("\n");

         System.out.print( " Calcule du prix d'un Trajet suivant : \n \n le prix du carburant choisi et la Longueur du trajet \n ");
         
         System.out.print("\n");

         /* Définir les variables Carburant  */

         System.out.print( " Choisissez le type de carburant : \n \n 0 Pour Diesel : \n \n 1 Pour Sans Plomb 95 : \n \n 2 Pour Sans Plomb 98 : \n \n " + " Votre réponse : ");

         /* Ouverture du Scanner */

         Scanner scan = new Scanner(System.in);

         /* Prise en compte de la valeur */
          
         Double carburant = scan.nextDouble();

         System.out.print("\n "); 

         /* Définition du choix  */

         System.out.print(" Saisissez la longueur du trajet en kilometres \n \n  Votre réponse : ");

         /* Définition des Valeurs Variable */

         Double kilometre = scan.nextDouble();

         System.out.print("\n");

         System.out.print( " Saisisser La consomation moyenne de votre véhicule en Litre par 100 kilometres : \n \n  Votre réponse :   ");

         Double consoVehicule = scan.nextDouble();

         System.out.print("\n");
        
         /* Calcule de base de la consomation au 100 km */
         
         Double conso = (kilometre * consoVehicule)/100;
           
         /* Définitions des valeurs Fixe des tarifs des Carburants */

         Double diesel = 1.547 ;

         Double sansPlomb95 = 1.688 ;

         Double sansPlomb98 = 1.718 ;

         /* Calcul Final du prix du trajet */
        
         Double trajetdiesel = (conso*diesel);

         Double trajetsansplomb95 = (conso*sansPlomb95);

         Double trajetsansplomb98 = (conso*sansPlomb98);

         /* Réponse du calcul selont choix des valeurs */

         if ( carburant == 0) {System.out.print( "Cout du Trajet en Euros : " + trajetdiesel) ;
            
         } 

         if (carburant == 1) {System.out.print( "Cout du Trajet en Euros : " + trajetsansplomb95);

         }

         if (carburant == 2) {System.out.print( "Cout du Trajet en Euros : " + trajetsansplomb98);
                
            }

            System.out.print("\n");

           /* Fin du Scanner */ 
           
            scan.close();
            
         }


        
    }

