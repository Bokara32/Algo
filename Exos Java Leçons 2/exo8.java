public class exo8 {


    /*  EXERCICE 8 (Version original): Créer un algorithme qui convertit n'importe qu'elle valeurs décimal (entier) en binaire */

    public static void main(String[] args) throws Exception {

        int valeurBase = 1;
        int quotient = valeurBase;
        int reste= 0; 
        String bin= "";
        while  (valeurBase<0){
            reste = quotient%2;
            quotient= quotient/2;
            bin= reste+bin; 

        }
            System.out.println();
            System.out.println("Valeur Décimal " + valeurBase);
            System.out.print(" Valeur Binaire " +bin);








    }

            /*  Résultat Attendu : 1 en décimal vaut 0001 en binaire */
}
