import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        /* Ouverture du Scanner Rayon */

        Scanner scan = new Scanner(System.in);

        System.out.print(" Saisissez un Rayon " );

        System.out.println("");

        /* Définition du Double et Scan de la Valeur */

        double Scanrayon = scan.nextDouble();

        /* Calcul de l'air de la Sphere */

        double As = (4 * Math.PI) * Math.pow(Scanrayon,2);

        /* Calcul du Volume de la Sphere */ 

        double Vs = (4 * Math.PI) * Math.pow(Scanrayon,3) /3 ;
        
        /* Inscription des résultat */

        System.out.println( " L'aire de la Sphere est : " + As );
        
        System.out.println("");

        System.out.println( " Le Volume de la Sphere est : " + Vs );

        scan.close();

        /* Fin du code */

        
    }
}
