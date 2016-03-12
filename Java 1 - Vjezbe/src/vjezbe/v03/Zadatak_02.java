/*
    Napisati program koji učitava niz cijelih brojeva (maksimalne veličine 50) i
    pohranjuje ga u jednodimenzionalno polje. Učitavanje se završava kada se
    učita broj -1 koji se zanemaruje. Učitani niz treba prepisati u novo polje, ali s
    obrnutim redoslijedom elemenata. Program treba ispisati tako dobiveno
    polje.

    Npr. ako je ulazni niz 2 -3 5 7, izlazni niz je 7 5 -3 2.
 */
package vjezbe.v03;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author programer
 */
public class Zadatak_02 {

    public static final void main(String[] args) {
        int[] input = getInput();
        int[] flipped = flipArray(input);
        System.out.println(Arrays.toString(flipped));
    }

    private static int[] getInput() {

        System.out.println("Enter number (-1 to finish)");
        Scanner s = new Scanner(System.in);

        int[] result = new int [50];
        int entryCount = 0;
        String tmp = s.nextLine();
        
        while (!tmp.equals("-1")) {
            if (entryCount > 48) {
                System.out.println("Too many entries");
            }
            
            result[entryCount] = Integer.parseInt(tmp);
                        
            tmp = s.nextLine();
            entryCount++;
        }

        return Arrays.copyOfRange(result, 0, entryCount);
    }

    private static int[] flipArray(int[] input) {
        int[] result = new int[input.length];
        
        for (int i = 0; i < result.length; i++) {
            result[input.length-i-1] = input[i];
        }
        
        return result;
    }

}
