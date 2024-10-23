import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* Ouverture du Scanner */

        Scanner scan = new Scanner(System.in);
       /* Declaration du prenom */
        String Prenom;
        
        System.out.println(" Saisissez votre Prénom ");
        Prenom = scan.nextLine();
       /* Réponse */
        System.out.println( " Bonjour " + Prenom );
       /* Fermeture du scanner */
        scan.close();
    } 
}
