/*
    Napišite program koji učitava niz znakova sa standardnog ulaza i ispisuje
    koliko ima slova, koliko brojeva i koliko "ostalih znakova". Npr. ako je uneseni
    niz znakova "Danas je 27.02.2010.", program treba ispisati:
 */
package vjezbe.v01;

import java.util.Scanner;

/**
 *
 * @author programer
 */
public class Zadatak_03 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter string to parse:");
        String data = in.nextLine();
        System.out.printf("Checking: %s \n", data);
        
        int letters = 0;
        int numbers = 0;
        int other = 0;
        
        for (char c : data.toCharArray()) {
            if (Character.isLetter(c)) {
                letters++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else {
                other++;
            }
        }
        
        System.out.println("Letters: " + letters);
        System.out.println("Numbers: " + numbers);
        System.out.println("Other:" + other);
    }
}
