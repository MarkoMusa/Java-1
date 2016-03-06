/*
 Napišite program koji ispisuje sve savršene brojeve. Savršeni brojevi su
 brojevi koji su jednaki sumi svih svojih djelitelja manjih od sebe. Npr. 28 je
 savršen broj jer vrijedi 28=1+2+4+7+14.
 */
package vjezbe.v02;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author programer
 */
public class Zadatak_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Integer> perfectNumbers;
        
        // MAX_INT = 2,147,483,647
        perfectNumbers = getPerfectNumbersUpTo(100000);

        perfectNumbers.stream().forEach((x) -> System.out.println(x));
        // perfectNumbers.stream().forEach(System.out::println);
    }

    private static List<Integer> getPerfectNumbersUpTo(int end) {

        LinkedList<Integer> results;
        results = new LinkedList<>();

        // technically 1 does not count
        for (int i = 2; i <= end; i++) {
            
            if (isPerfectNumber(i)) {
                results.add(i);
            }
        }

        return results;
    }

    private static int sumArray(Integer[] digits) {

        int result = 0;

        for (Integer digit : digits) {
            result += digit;
        }

        return result;
    }

    private static boolean isPerfectNumber(int i) {
        List<Integer> divisors;
        divisors = getDivisors(i);
        // NOTE: Because of type erasure, the ArrayList does not know its generic 
        // type at runtime, so it can only give you the most general Object[]. 
        // You need to use the other toArray method which allows you to specify the
        // type of the array that you want.
        // Hence seed required: new Integer[divisors.size()]
        
        return i == sumArray(divisors.toArray(new Integer[divisors.size()]));
    }

    private static List<Integer> getDivisors(int i) {
        List<Integer> divisors;
        divisors = new ArrayList<>();
        
        for (int j = 1; j < i ; j++) {
            if (i%j == 0) {
                divisors.add(j);
            }
        }
        
        return divisors;
    }

}
