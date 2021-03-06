/*
    Napisati program koji dijeli dva cijela broj uz uvjet da se ne smije koristiti
    množenje i dijeljenje. Dijeljenje ponoviti 100 000 puta. Ispisati rezultat na tri
    decimale i ukupno vrijeme trajanja programa (hint:
    System.currentTimeMilis()) . Brojevi se zadaju prilikom pokretanja
    programa.  27 / 7 = 3.857
 */
package vjezbe.v02;

public class Zadatak_03 {

   
    public static void main(String[] args) {
        divideAndDisplay(27, 13);
        divideAndDisplay(27, 4);
        divideAndDisplay(27, 7);
        divideAndDisplay(25, 7);
        divideAndDisplay(28, 7);
   
    }

    private static void divideAndDisplay (int a, int b) {
        long start;
        long end;
        
        System.out.print(a + " / " + b + " = ");
        int[] result = new int[2];
        
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
             result = divide(a, b);
        }
        end = System.currentTimeMillis();
        
        System.out.println(String.format("%d.%03d",result[0],result[1]));
        
        System.out.println("Execution time (ms sec): " + (end - start));
    }
    
    private static int[] divide(int a, int b) {

        // store results
        // result[0] = integer part
        // result[1] = decimal part
        int[] result = {0,0};
        
        // Divison is subtraction, just need to count number of subtractions
        while (a >= b) {
            a -= b;
            result[0]++;
        }
        
        // Leftover in a is the remainder. Multiply by 1000 so we can devide again
        // and get decimal part. 
        a *= 10000;

        // Repeat to get decimal part
        while (a > b) {
            a -= b;
            result[1]++;
        }
        
        if (result[1] % 5 > 0) {
            result[1]++;
            result[1] /= 10;
        }
        return result;
    }
}
