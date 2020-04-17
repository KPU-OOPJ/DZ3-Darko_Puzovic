
package javaapplication1;


public class TestDNKLanac {
    public static void main (String [] args) {
        DNKLanac dnk = new DNKLanac (8);
        dnk.dodajKariku('A');
        dnk.dodajKariku('C');
        dnk.dodajKariku('C');
        dnk.dodajKariku('G');
        dnk.dodajKariku('T');
        dnk.dodajKariku('T');
        dnk.dodajKariku('T');
        dnk.dodajKariku('T');
        dnk.ispisiDNKLanac();
        System.out.println();
        dnk.ispisiDNKLanacObrnuto();
        
    }
}
            

