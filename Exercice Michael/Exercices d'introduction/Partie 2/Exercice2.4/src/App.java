import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Ouverture du Scanner */

        Scanner scan = new Scanner(System.in);

        /* Définition des Valeurs en dehors de la boucle pour l'itération */

        int Heure = Integer.MIN_VALUE;

        int Minute = Integer.MIN_VALUE;

        /* Définir les Valeurs Réels  */

        do { System.out.print("\n" );

        System.out.print(" Saisissez les Heures Format 24H \n \n ");

        Heure = scan.nextInt(); 
        
        System.out.print("\n "); 

        System.out.print(" Saisissez les Minutes \n \n ");

        /* Mise en place des conditions */

        Minute = scan.nextInt();
        
        if ( Heure < 0 || Heure >= 24 || Minute > 59) { System.out.print(" Les données saisies sont invalides \n \n " + " On recommence !! \n "); }

        } while (Heure < 0 || Heure >= 24 || Minute > 59 );  

        /* Fin de boucle si condition Fausse, début du calcul */

        System.out.print("\n ");

        int calculH = Heure + 1;

        int calculM = Minute + 3;

        int calculim = calculM - 60;

        int calculAm = calculH - 24;

        /* Condition de calcul en rapport aux Minutes et aux heures */

        if ( Heure < 24) { System.out.print(" Dans trois minutes, il sera : " + calculAm + " h " + calculim ); }

        else if (calculM > 60) { System.out.print(" Dans trois minutes, il sera : " + calculH + " h " + calculim ); }
        
        else { System.out.println(" Dans trois minutes, il sera : " + Heure + calculM ); }

        scan.close();
    }
}
