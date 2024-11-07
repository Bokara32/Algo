import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
    

        

        /* Ouverture du Scanner */

        Scanner scan = new Scanner(System.in); 

        System.out.print( " \n");

        System.out.print( " Saisissez votre Age : \n \n");

        int Age = scan.nextInt(); 

        System.out.print( " Vous êtes titulaire du permis de conduire depuis combien d'années ? \n \n Saisissez la valeur :");

        int APermis = scan.nextInt();

        System.out.print("\n \n");
        
        System.out.print( " Combien avez vous de Sinistre : \n \n ");

        int sinistre = scan.nextInt();

        System.out.print(" saisissez votre nombre d'années d'assurance : \n \n ");

        int Aassu = scan.nextInt();

        if ( (Age <= 25 && APermis <= 2 && sinistre == 0) || (Age > 25 && APermis < 2 && sinistre == 1 ) || ( Age > 25 && APermis > 2 && sinistre == 2)){ System.out.print( " Votre tarif sera Rouge "); }

        else if ( (Age <= 25 && APermis >= 2 && sinistre == 0) || (Age > 25 && APermis < 2 && sinistre == 0) ||( Age > 25 && APermis > 2 && sinistre == 1)|| (Age > 25 && APermis < 2 && sinistre == 1 && Aassu > 5) ){ System.out.print( " Votre tarif sera orange "); }

        else if (( Age > 25 && APermis > 2 && sinistre == 0) || ( Age > 25 && APermis > 2 && sinistre == 1 && Aassu > 5)){ System.out.print( " Votre tarif sera vert ");}

        else if (Age > 25 && APermis > 2 && sinistre == 0 && Aassu > 5){System.out.print(" Votre tarif sera Bleu "); }

        else { System.out.print( " Dossier refuser "); }


        
        
    }
}
