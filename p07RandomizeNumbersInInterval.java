import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by stoya on 23.03.16.
 */
public class p07RandomizeNumbersInInterval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int difference, minNumb, maxNumb = 0;
        Random rand = new Random();
        difference = Math.abs(number1 - number2) + 1;   // diff between numbers + 1 -> interval N to M inclusive
        minNumb = number1 >= number2 ? number2 : number1;
        maxNumb = number1 <= number2 ? number2 : number1;

        List<Integer> intNumbers = new ArrayList<>();

        while (intNumbers.size() < difference) {
            int randNumb = rand.nextInt(difference) + minNumb;

            if (intNumbers.contains(randNumb)) {
                continue;
            } else {
                intNumbers.add(randNumb);
            }
        }

        for (int item : intNumbers
             ) {
            System.out.print(item + " ");
        }
    }
}
