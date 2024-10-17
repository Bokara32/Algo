public class exo6 {



    /*  EXERCICE 6 : Créer un convertisseur de secondes au format Heures : Minutes : secondes */

    public static void main(String[] args){
    
 
    int valeur = 59;
    int Heures = (valeur/3600); 
    int Minutes = (valeur%3600)/60;
    int Secondes = (valeur%60);
    
    System.out.println(valeur + " egal à " +Heures + " heures " +Minutes + " minutes " +Secondes + " secondes ");

    



    }


}
