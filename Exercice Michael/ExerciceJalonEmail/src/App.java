
/* Réception d'un message électronique */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* Ouverture du Scanner  */
        
        Scanner  scan = new Scanner(System.in); 

        /* Définition Des Valeurs de saisie */

         boolean destinataireOk = true; /* L'adresse email du destinataire existe oui (true) ou non (false) */

         boolean espaceDispo = true; /* L'éspace de Stockage Disponible est'il suffisant oui (true) ou non (false)  */

         boolean pieceJ = true; /* le message contient une piéce jointe oui (true) ou non (false) */

         boolean virus = false; /* La piéce jointe contient un virus oui (true) ou non (false) */

         int pieceJp = 25; /* La piéce jointe a un poid inférieur à 25 */

         boolean destianataireAbs = false ; /* Le déstinataire est'il présent oui (true) ou non (false) */

         /* Définition du boolean selon condition */

         if( (destinataireOk && espaceDispo == true) && (pieceJ== false)^(pieceJ== true && virus == false && pieceJp < 25  )&& (destianataireAbs == true)) 
            { System.out.print( " \n\n Message Transmis : ");} 
         
         else if ((destinataireOk && espaceDispo == true) && (pieceJ== false)^(pieceJ== true && virus == false && pieceJp < 25  )&& (destianataireAbs == false))
                  { System.out.print("\n \n  Message Transmis : " + " Le déstinataire est absent et rique de ne pas pouvoir vous répondre");}

         else { System.out.print(" \n\n Une erreur est survenu le message n'a pas pu être transmis à l'éxpediteur ");

         
        
            
        
        }
        

   
        

         
        
        
        
         
        
          
         


    }
    }
