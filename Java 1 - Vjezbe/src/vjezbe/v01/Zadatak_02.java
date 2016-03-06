/*
    Napišite program koji učitava broj koji predstavlja iznos u kunama koji
    prodavačica treba uzvratiti klijentu. (Demo klase Scanner) Prodavačica uvijek
    uzvraća u najvećim novčanicama (kovanicama). Program treba ispisati u
    koliko kojih novčanica (kovanica) treba uzvratiti. Novčanice u HR imaju
    vrijednost 1000, 500, 200, 100, 50, 20 i 10 kuna, a kovanice su od 5, 2, 1, 0.50,
    0.20, 0.10, 0.05, 0.02 i 0.01 kuna. Npr. ako je unesena vrijednost 1978,
    program treba ispisati:

    1*1000
    1*500
    2*200
    1*50
    1*20
    1*5
    1*2
    1*1
 */
package vjezbe.v01;

import java.util.Scanner;


/**
 *
 * @author programer
 */
public class Zadatak_02 {
    
    static enum MoneyType { KUNE, LIPE }
    
    static int[] moneyValues = { 
        1000*100, 
        500*100, 
        200*100, 
        100*100,
        50*100,
        20*100,
        10*100,
        5*100,
        2*100,
        1*100,
        50,
        20,
        10,
        5,
        2,
        1
    };
    
    public static void main(String[] args) {
        
        int k = getAndParseInput();
   
        parseMoney(k);

    }

    private static int getAndParseInput() {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number:");

        String[] tmp = in.nextLine().split("\\.");
        
        int result = 0;
        if(!tmp[0].equalsIgnoreCase("")) {
           result = Integer.parseInt(tmp[0]) * 100;
        }
        
        if (tmp.length > 1 && tmp[1] != "") {
            result += Integer.parseInt(tmp[1]);
        } 
        
        return result;
    }

    private static void parseMoney(int i) {
  
        int numberOfMoneyz = 0;
        int typeValue = 0;
        String suffix = "";
        String type = "";
        
        // TODO: Finish finish this problem
        for (int moneyValue : moneyValues) {
            
                if (i == 0 ) break;
                if (i < moneyValue) continue;
                
                numberOfMoneyz = i/moneyValue;
                if (moneyValue > 500) {
                    type = "papir";
                } else {
                    type = "kovanica";
                }
                
                if (moneyValue < 100) {
                    typeValue = moneyValue;
                    suffix = "lp";
                } else {
                    typeValue = moneyValue/100;
                    suffix = "kn";
                }
                
                
                
                 
                
                System.out.printf("%d * %d %s %s\n", numberOfMoneyz, typeValue, suffix, type  );
                i = i%moneyValue;

        }
    }
}
