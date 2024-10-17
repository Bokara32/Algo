public class exo7 {


    /*  EXERCICE 7 : Créer un algorithme qui simule des opérations bancaires, dont vous effectuer un paiement en 3 fois par carte d'un montant donner à votre guise. Donner le solde restant à chaque opération. 
    Sachant que vous avez au choix 3 types de cartes qui n'ont pas les mêmes règles de découvert. Votre solde bancaire de départ sera de 1000€
    
     * 
     * A noter vous avez 3 types de cartes :
     * 
     * Carte Classique (id:1): minimum -500€ de découvert
     * Carte Gold (id:2): minmium -1000€ de découvert
     * Carte Electron (id:0) : minimum 0€ de découvert
       */

    public static void main(String[] args) throws Exception {


        System.out.println();

    }

        /*  Résultat Attendu : 


         *Votre solde : 1000.00€ 
         Votre carte : carte electron
         paiement en 3 fois de 1500€

         * 
         * paiement n°1 : 500.00€
         * Opération approuvé
         * solde restant : 500.00€
         * 
         * paiement n°2 : 500.00€
         * Operation approuvé
         * solde restant : 0€
         * 
         * 
         * paiement n°3 : 500.00€
         * Operation refusé
         * solde insufissant
         * 
         * 
        */

}
