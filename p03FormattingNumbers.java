import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by stoya on 18.3.2016 г..
 * Write a program that reads 3 numbers: an integer a (0 ≤ a ≤ 500), a floating-point b and a
 * floating-point c and prints them in 4 virtual columns on the console. Each column should
 * have a width of 10 characters. The number a should be printed in hexadecimal, left aligned;
 * then the number a should be printed in binary form, padded with zeroes, then the number b
 * should be printed with 2 digits after the decimal point, right aligned; the number c should
 * be printed with 3 digits after the decimal point, left aligned.
 */
public class p03FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner input = new Scanner(System.in);
        int numA = input.nextInt();
        double numB = input.nextDouble();
        double numC = input.nextDouble();

        System.out.print("|");
        System.out.printf("%-10X|", numA);  // first col --> HEX

        String binString = Integer.toBinaryString(numA);
        while (binString.length() < 10) {    //pad with 10 0's
            binString = "0" + binString;
        }
        System.out.printf("%S|", binString);    // second col --> BIN

        System.out.printf("%10.2f|", numB);     // third col

        System.out.printf("%-10.3f|", numC);    // fourth col

    }
}
