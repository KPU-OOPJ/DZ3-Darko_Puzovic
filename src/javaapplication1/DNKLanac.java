
package javaapplication1;

public class DNKLanac {

  char [] karike;
    int broj_karika ;
    
    public DNKLanac(int max_duzina){
        if (max_duzina > 0) {
             karike = new char [max_duzina];
             broj_karika = 0;
    }
        else {
            karike = new char [256];
            broj_karika = 0;}
    }
    void dodajKariku (char karika){
        if ( ((karika == 'A')||(karika == 'C')||(karika == 'G')||(karika == 'T')) && (broj_karika < karike.length)) {
            karike[broj_karika] = karika ;
            broj_karika++ ;
        }
        else 
            System.out.println("Greska, karika nije dodata.");
    }
    int prebrojAKarike (){
        int broj = 0 ;
        for (int i= 0; i < broj_karika ; i++)
             if (karike[i]== 'A') broj ++ ;
        return broj; }
    int trenutnaDuzinaLanca(){
        return broj_karika;
    }
    int maxKapacitetLanca(){
        return karike.length ;
    }
    int preostaliKapacitet (){
        return (karike.length - broj_karika);
    }
    
    void ispisiDNKLanac (){
        for (int i=0; i < broj_karika; i++)
            System.out.print(karike[i]);
    }
    void ispisiDNKLanacObrnuto (){
        for (int i = broj_karika -1 ; i >= 0; i--)
            System.out.print(karike[i]);
    }
}

        
    
   
  
    
    

