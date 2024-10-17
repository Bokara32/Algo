public class App {
    public static void main(String[] args) throws Exception
     {
        int valeur /*Nombre de Jours a calculer"*/= 3650;
        int Janvier = 31;
        int Fevrier = 28;
        int FevrierBissextile = 29;
        int Mars = 31;
        int Avril = 30;
        int Mai = 31;
        int Juin = 30;
        int Juillet= 31;
        int Aout = 31;
        int Septembre =30;
        int Octobre = 31;
        int Novembre = 30;
        int Decembre = 31;
        int Annee = (valeur/365);
        int Mois = (valeur/12);
        int Jours = (Mois%31);
        int Heures = (valeur/3600); 
        int Minutes = (valeur%3600)/60;
        int Secondes = (valeur%60);
        int Anneenormal = Janvier + Fevrier + Mars + Avril + Mai + Juin + Juillet + Aout + Septembre + Octobre + Novembre + Decembre; 
        int AnneeBi = Janvier + FevrierBissextile + Mars + Avril + Mai + Juin + Juillet + Aout + Septembre + Octobre + Novembre + Decembre; 
         
         if (Annee%400){ Math.pow(Annee, AnneeBi);} else 
        {
        { Math.pow( Annee, Anneenormal);}
        

        {System.out.print( Annee);} }
       
    }
}
