import java.util.Scanner;
public class App {
    public static void main(String[] args){

        /* Demarer Scanner Déclaration des variables */
        Scanner scan = new Scanner(System.in);

        int Nombre1;
        int Nombre2;
         /* Déclarer Text et Valeurs  */ 

        System.out.print( " Pour calculer la moyenne veuillez saisir les valeurs " ); 
        
        System.out.println("");
         
        System.out.print(" Saisissez la valeur 1 ");
        Nombre1 = scan.nextInt();

        System.out.print( " Saisissez la valeur 2 ");
        Nombre2 = scan.nextInt();
        /* Fabrication du Tableau des valeurs */

        int array[] = {Nombre1,Nombre2};
        for( int somme:array ); 
        /* Déclaration de la boucle en fonction de la longueur du Tableau */
        int somme = 0;
        for( int i = 0; i < array.length; i++){
        somme += array[i];
        }
        /* Division de la valeur de la somme du tableau par le nombre d'élements du tableau */
        float moyenne = (float) somme / array.length;

        System.out.print( " La moyenne de " + Nombre1 + " et " + Nombre2 + " Est : " + moyenne );

        scan.close();





        


        
    }
}
