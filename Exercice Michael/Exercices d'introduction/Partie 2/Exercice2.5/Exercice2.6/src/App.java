import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* Ouverture du Scanner */

        Scanner scan = new Scanner(System.in);

        System.out.print("\n \n ");

        System.out.print( " Saisissez le nombre de Copie désirer : ");

        System.out.print("\n \n ");

        /* Incrémentation de la valeur en double a cause de la virgule du multiplicateur */

         double nombreCopie = scan.nextInt();

        System.out.print("\n \n ");

        /* Ajout de la valeur réceptacle */

        double Prix = 0;

        /* Prise en compte des conditions pour identifier la valeur variable */

        if (nombreCopie < 10) { Prix = 0.10 ; }

        else if (nombreCopie < 30) { Prix = 0.09 ; }

        else if (nombreCopie > 30)  { Prix = 0.08 ; }

        /* Calcul du prix avec variable */

        double calculPrix = nombreCopie * Prix ; 

        System.out.print(" Votre Total à Payer est de : " + calculPrix + " euros ");

        /* Fin du Scanner */

        scan.close();


    }
}
