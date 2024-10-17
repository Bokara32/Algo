     
     class GFG {
        int binaryToDecimal (long binary) 
        {  //on définit les décimales dans le magasin interne
            int decimalNumber = 0, i = 0;
         while (binary > 0) {
        
            decimalNumber += Math.pow(2, i++) * (binary % 10);
            binary /= 10;}
        
          return decimalNumber;
        }
         String decimalToHex (long binary)
{    
     int decimalNumber = binaryToDecimal (binary); 
     String hexNumber  = Integer.toHexString(decimalNumber);
     hexNumber = hexNumber.toUpperCase();
     return hexNumber; 
 }
    public static void main (String[] args)
{ 
     GFG ob = new GFG(); 
     long num = 101111111 ; 

     
        System.out.println( " Valeur Binaire : " +num );
        System.out.println( " Valeur Hexadecimal : " + ob.decimalToHex(101111111)); 
    

    
        
    }
}


