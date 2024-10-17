public class App {
    public static void main(String[] args) throws Exception { 
        int valeurBase= 1212; 
        int quotient = valeurBase;
        int reste = 0;
        String bin = "";
    
        
        while (quotient>0) { 
            reste= quotient%2;
            quotient= quotient/2; 
            bin = reste + bin; 
        }    
            
            System.out.println();
            System.out.println("Valeur Décimal " + valeurBase);
            System.out.print(" Valeur Binaire " +bin);
        } 
        
    }

