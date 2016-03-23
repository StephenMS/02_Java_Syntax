import java.util.Scanner;

/**
 * Created by stoya on 23.03.16.
 */
public class p06ConvertBase7ToDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberBase7 = input.nextInt();

        int tempNumb = numberBase7;
        int result = 0;
        int power = 0;  // first power value - next +1
        int base = 7;   // main base of input number to convert to Decimal
        while (tempNumb > base) {
            result += (tempNumb % 10) * Math.pow(base, power);
            tempNumb /= 10;
            power++;
        }

        result += tempNumb * Math.pow(base, power);     // adding final digit to the result
        System.out.println(result);

    }
}
