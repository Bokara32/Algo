
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner scan;

      scan = new Scanner (System.in);
     
      /* Partie Nom et Prenom */

      String  NometPrenom;

      System.out.println( " Bonjour, Veuillez Saisir votre Nom et Prenom ");
      NometPrenom = scan.nextLine();

      System.out.println( "Bienvenue : " + NometPrenom );
      
      /* Partie Convertion Date */
      
      DateTimeFormatter ConvertisseurFR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      
      System.out.println( " Quelle est votre Date de Naissance ? Fomat JJ/MM/AAAA ");
      String Scandate = scan.nextLine(); 
      
      /* Partie Calcul Date */
      
      LocalDate DateAnniv = LocalDate.parse(Scandate,ConvertisseurFR);
      
      LocalDate DateAujourdhui = LocalDate.now();
      
      /* Partie Calcul Age Utilisateur */
      
      Period period = Period.between(DateAujourdhui, DateAnniv);

      int Age = Math.abs(period.getYears());
      if (Age >= 18 ){ 

        /* Partie Réponse en fonction de l'Age */
      String Metier;

      System.out.println( " Quel est votre métier ? ");
      Metier = scan.nextLine(); 
    
      System.out.println( " Bonjour et Bienvenue : " + "_" +  NometPrenom  + "  Vous Avez " + Age + " Ans " + 
      " Votre date d'anniversaire est le : " + DateAnniv +  " et votre métier est : " + Metier);
    
    }else{

        String CouleurPreferee;

        System.out.println( " Quelle est votre couleur préférée ? ");
        CouleurPreferee = scan.nextLine();

        System.out.println( " Bonjour et Bienvenue "  +  NometPrenom  + "  Vous Avez " + Age + " Ans" 
        + " Votre date d'anniversaire est le : " + DateAnniv+ " est votre CouleurPreferee est : " + CouleurPreferee );
    }


      

      

     
      
     
           
         
            

        
    }
}
