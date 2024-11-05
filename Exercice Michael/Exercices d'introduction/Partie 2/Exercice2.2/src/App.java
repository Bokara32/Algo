import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Enregistrement des Valeurs a calculer */

        Scanner scan = new Scanner(System.in); 

        System.out.print(" \n \n ");

        System.out.print(" Saisisser la Premiere Valeur \n \n ");

        double Valeur1 = scan.nextDouble();

        System.out.print(" Saisisser la Deuxieme Valeur \n  \n ");
 
        double Valeur2 = scan.nextDouble();

        /* Calcul du resultat */
        
        double Resultat = Valeur1*Valeur2;

        System.out.print("\n");

        /* Mise en forme de la condition et Affichage du résultat */

        if (Resultat < 0 )

           { System.out.print(" Le resultat des valeurs saisies : " + Resultat + " est Négative"); }
        
       else 
           { System.out.print(" Le resultat des valeurs saisies : " + Resultat +  " est Positive"); }
        
       /* Fermeture du Scanner */
       
       scan.close();


         
    }
}
