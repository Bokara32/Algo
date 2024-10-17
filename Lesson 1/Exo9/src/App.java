public class App {
    public static void main(String[] args) throws Exception {
        int valeurBase= 12; 
        int quotient = valeurBase;
        int reste = 0;
    
        
        while (quotient>0) { 
            reste= quotient%2;
            quotient= quotient/2; 
            
            System.out.print(reste);
        } 
        
}
}