import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* Ouverture du Scanner */

        Scanner scan = new Scanner(System.in); 

        /* Déclaration des Valeurs vide */

        int vdepart ;

        int vsuivante ;
        
        System.out.print(" \n ");

        /* Définition de la fonction du programme et récupération de la valeur initial */

        System.out.print( " Programme de calcul des 10 Prochains nombres \n "  + " Saisissez un nombre Entier \n ");

        vdepart = scan.nextInt(); 

        System.out.print( " Les 10 nombres après " + vdepart + " Sont : \n ");

        /* Définition du cacul et de la condition de boucle */

        vsuivante = vdepart ; 

        while ( vsuivante < vdepart + 10) { vsuivante++;  System.out.print( vsuivante + " , ");} 

        scan.close();

        /* Fin du Scanner */

       

        
            
        
    
    
    
    
    
    
    
    
    }
}
