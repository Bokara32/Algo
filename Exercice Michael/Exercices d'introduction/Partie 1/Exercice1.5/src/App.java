import java.util.Scanner;

public class App {
   public static void main(String[] args) throws Exception {

    /* Ouverture du Scanner */

    Scanner Scan = new Scanner(System.in);

    /* Définition des valeurs à renseigner */

    System.out.println( " Bonjour Pour Calculer l'air du Secteur Circulaire renseigner la Valeur du Rayon et de L'angle en degrés ");
    
    System.out.println("");

    System.out.println( " Saisissez la Valeur du Rayon ");

    /* Prise en compte de la valeur rayon */

    Scan.nextDouble();

    double ScanRayon = Scan.nextDouble();
    
    double Rayon = ScanRayon;

    /* Prise en compte de la valeur de l'angle */

    System.out.print(" Saisissez la Valeur de l'angle ");

    Scan.nextDouble();

    double ScanAngle = Scan.nextDouble();

    double Angle = ScanAngle;

    /* Calcul de l'air du secteur circulaire avec valeur renseigner (Rayon et Angle) */

    double Asc = ( Math.PI * Math.pow(Rayon,2) * Angle) /360;

    /* Le Math.PI est plus précis que la simple valeur 3.14 ce qui change le résultat final */
    
    System.out.print(" L'aire du secteur circulaire est : " + Asc );
    
    /* Fermeture du Scanner */

    Scan.close();



       
    }
}
