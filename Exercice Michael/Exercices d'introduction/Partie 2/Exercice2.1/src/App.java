import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Ouverture du Scanner */

        Scanner scan = new Scanner(System.in); 

        System.out.print(" \n \n ");

        System.out.print( "Saisissez un Nombre entier \n \n");
        
        /* Enregistrement de la Valeur */
        
        int Valeur = scan.nextInt();

        System.out.print("\n");
        
        /* Determinaison de la Valeur Positive ou Negative */

       if (Valeur < 0 )

       { System.out.print(" La Valeur saisie : " + Valeur + " est Négative"); }
        
       else 
       { System.out.print(" La Valeur saisie : " + Valeur +  " est Positive"); }
        
       /* Fermeture du Scanner */
       
       scan.close();

       
    }
}
