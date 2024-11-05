import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /* Ouverture du Scanner */

        Scanner scan = new Scanner(System.in);

        System.out.print("\n");
        
        System.out.print(" Saisissez Votre Age : ");

        System.out.print(" \n \n ");

        int Age = scan.nextInt();

        System.out.print(" \n  ");

        /* Etablissement du Classement selon Age */

         if (Age < 5) { System.out.print( " Vous êtes trop Jeune "); 
            
        }
         else if (Age <= 6) { System.out.print( " Vous êtes Débutant ");
            
        } 
         else if (Age <= 8) { System.out.print( " Vous êtes Poussin ");

        }
         else if (Age <= 10) { System.out.print( " Vous êtes Benjamin ");

        } 
         else if (Age <= 10) { System.out.print( " Vous êtes Benjamin ");

        }  /* C'est long Hein.... */
         else if (Age <= 12) { System.out.print( " Vous êtes Pupille "); 
        
        }
         else if (Age <= 14) { System.out.print( " Vous êtes Minime ");

        }
         else if (Age <= 16) { System.out.print( " Vous êtes Cadet ");

        }  /* C'est presque Fini */  
         else if (Age <= 18) { System.out.print( " Vous êtes Junior ");

        }
         else if (Age <= 34) { System.out.print( " Vous êtes Sénior ");

        }
         else if (Age >= 35) { System.out.print( " Vous êtes Vétéran ");

    }
         scan.close();

    }
}