/*
 Napišite program koji unosi broj preko komandne linije i ispisuje njegov
 binarni, oktalni i heksadecimalni ekvivalent.
 Npr. za unos 32 treba ispisati sljedeće:
 Dekadski: 32
 Binarni: 100000
 Oktalni: 40
 Heksadecimalni: 20
 */
package vjezbe.v02;

import java.util.Scanner;

/**
 *
 * @author programer
 */
public class Zadatak_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number to convert");
        int input = in.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(input));
        System.out.println("Octal: " + Integer.toOctalString(input));
        System.out.println("Hex: " + Integer.toHexString(input));
    }
}
