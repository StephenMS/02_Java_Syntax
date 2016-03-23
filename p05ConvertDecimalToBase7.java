import java.util.Scanner;

/**
 * Created by stoya on 18.3.2016 г..
 */
public class p05ConvertDecimalToBase7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int base = 7;   // specify the base

        int tempIntDecimal = number;
        int resultInBase = 0;

        while (tempIntDecimal > base) {
            resultInBase *= 10;
            resultInBase += tempIntDecimal % base;
            tempIntDecimal = tempIntDecimal / base;
        }
        resultInBase *= 10;
        resultInBase += tempIntDecimal;     // in reverse order



        System.out.println(resultInBase);
    }
}
