/*
 * Napišite program koji ispisuje sve Armstrongove brojeve (provjeru vršiti za 
 * brojeve do 10000). Armstrongovi brojevi su brojevi koji su jednaki sumi
 * kubova svojih znamenaka. Npr. 153 je Armstrongov broj jer vrijedi
 * 153=13+53+33
 */
package vjezbe.v01;

import java.util.Scanner;

public class Zadatak_01 {

    public static void main(String[] args) {
        
        /*
        Scanner in = new Scanner(System.in);
        
        System.out is static instance of PrintWriter
        System.out.println("Enter number to check if Armstrong:");
        int number = in.nextInt();
        System.out.printf("Checking: %d ", number);
        boolean isArmstrong = checkIfArmstrong(number);
        
        if (isArmstrong) {
            System.out.println("Is Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
        */
        
        for (int i = 1; i < 100000; i++) {
            if (checkIfArmstrong(i)) {
                    System.out.printf("%d is Armstrong \n", i);
               } 
        }
        
    }
    
    public static boolean checkIfArmstrong(int n) {
        
        int tmp = n;
        int sum = 0;
        while (tmp > 0) {            
            sum += (int)Math.pow(tmp % 10, 3);
            tmp /= 10;
        }
 
        return sum == n;
    }
}
