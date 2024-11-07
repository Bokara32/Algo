import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
    

        

        /* Ouverture du Scanner */

        Scanner scan = new Scanner(System.in); 

        System.out.print( " \n");

        /* Saisie des informations */

        System.out.print( " Saisissez votre Age : \n \n");

        int Age = scan.nextInt(); 

        System.out.print( " Vous êtes titulaire du permis de conduire depuis combien d'années ? \n \n Saisissez la valeur :");

        int APermis = scan.nextInt();

        System.out.print("\n \n");
        
        System.out.print( " Combien avez vous de Sinistre : \n \n ");

        int sinistre = scan.nextInt();

        System.out.print(" saisissez votre nombre d'années d'assurance : \n \n ");

        int Aassu = scan.nextInt();

        /* Renseignement des Variables */

        int AgeT = 0; 

        int ApermiT = 0;

        int sinistreT = 0; 

        int AassuT = 0 ;

        /* Mise en place des conditions des variables */

        if ( Age<= 25){ AgeT = 0 ;} else { AgeT = 1 ;}

        if ( APermis <= 2) { ApermiT = 0; } else { ApermiT = 1 ;}

        if ( sinistre == 0 ) { sinistreT = 1;} else if(sinistre == 1){ sinistreT = -1;}else if(sinistre == 2){ sinistreT = -2;} else { sinistreT = -3;}
    
        if ( Aassu > 5) { AassuT = 1;} else { AassuT = 0;}

        /* Calcul du résultat */

        int CalculP = AgeT + ApermiT + sinistreT + AassuT;

        /* Affichage du résultat selon condition  */

        if ( CalculP < 0) { System.out.print( " Votre dossier est refuser ");  }

        else if ( CalculP == 0 ) { System.out.print( " Votre tarif sera Rouge ");}
        
        else if ( CalculP <= 2 ) { System.out.print( " Votre tarif sera Orange ");}

        else if ( CalculP == 3 ) { System.out.print( " Votre tarif sera Vert ");} 

        else { System.out.print( " Votre tarif sera bleu ");}

        scan.close();
        
    }
}
