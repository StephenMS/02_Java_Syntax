import java.util.Scanner;

/**
 * Created by stoya on 23.3.2016 г..
 */
public class p08OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();

        String[] inputStrArr = inputStr.split(" ");
        int countNumbers = inputStrArr.length;
        if ((countNumbers % 2) == 0) {
            // there are a even count of numbers from input - processing ...

            for (int i = 0; i < countNumbers - 1; i = i + 2) {
                int number1 = Integer.parseInt(inputStrArr[i]);
                int number2 = Integer.parseInt(inputStrArr[i + 1]);

                if (((number1 % 2) == 0) && ((number2 % 2) == 0)) {
                    // both are even
                    System.out.printf("%d, %d --> both are even\n", number1, number2);
                } else if (((number1 % 2) != 0) && ((number2 % 2) != 0)) {
                    // both are odd
                    System.out.printf("%d, %d --> both are odd\n", number1, number2);
                } else {
                    System.out.printf("%d, %d --> different\n", number1, number2);
                }
            }
        } else {
            // the array of input numbers isn't even !
            System.out.println("Invalid length");
        }
    }
}
