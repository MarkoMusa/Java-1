/*
    Napisati program koji izvršava kompresiju ulaznog niza. Program učitava niz
    prirodnih brojeva (učitavanje se završava kada se učita broj -1 koji se
    zanemaruje) koji predstavlja niz kojega treba komprimirati.

    Maksimalna veličina ulaznog niza je 100 brojeva. Niz se komprimira na
    sljedeći način: slijed ponavljanja istog broja unutar niza se zamjenjuje parom
    brojeva od kojih je prvi sam broj, a drugi predstavlja broj uzastopnih
    ponavljanja tog broja. Npr. za ulazni niz 1 1 2 5 5 5 5 1 1 1 -1, izlazni
    (komprimirani niz) je slijedeći :
    1 2 2 1 5 4 1 3.
    Učitani niz se komprimira te kao takav zapisuje u novo polje. Potrebno je
    ispisati novodobiveno polje.
 */
package vjezbe.v03;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author programer
 */
public class Zadatak_01 {
    
    public static final void main(String[] args) {
        
        Deque<Integer> input = getInput();
        
        Deque<Integer> compressed = compress(input);
        
        printCompressed(compressed);
    }
   
    private static Deque<Integer> getInput() {
        
        System.out.println("Enter numbers (separated by space)");
        Scanner s = new Scanner(System.in);
        
        String tmp = s.nextLine();
        
        Deque<Integer> input =  new ArrayDeque<>();
        
        int count = 0;
        
        for (StringTokenizer stringTokenizer = new StringTokenizer(tmp); stringTokenizer.hasMoreTokens();) {
            String token = stringTokenizer.nextToken();
            
            if (token.equals("-1") || count > 98 ) {
                break;
            }
          
            input.push(Integer.parseInt(token));
                                   
            count++;
        }
        
        return input;
    }

    static final int NUMBER = 0;
    static final int COUNT = 1;
    private static Deque<Integer> compress(Deque<Integer> input) {
       
        Deque<Integer> result;
        result = new ArrayDeque<>();
        
        int count = 0;
        int entry = 0;
        
        while (!input.isEmpty()) {
            
            count = 1;
            entry = input.pop();
            
            while (!input.isEmpty() && input.peek() == entry ) {
                count++;
                input.pop();
            }
            
            result.push(count);
            result.push(entry);
        }
  
        return result;
    }

    private static void printCompressed(Deque<Integer> compressed) {
        
        while (!compressed.isEmpty()) {
            
            System.out.print(compressed.pop()+ " ");
          
        }
    }
}
