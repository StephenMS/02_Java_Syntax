import java.util.Locale;
import java.util.Scanner;

/**
 * Created by stoya on 18.3.2016 г..
 */
public class p04CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner input = new Scanner(System.in);
        double numbA = input.nextDouble();
        double numbB = input.nextDouble();
        double numbC = input.nextDouble();

        double f1 = Math.pow((Math.pow(numbA, 2) + Math.pow(numbB, 2)) / (Math.pow(numbA, 2) - Math.pow(numbB, 2)),
                ((numbA + numbB + numbC) / Math.sqrt(numbC)));
        double f2 = Math.pow((Math.pow(numbA, 2) + Math.pow(numbB, 2) - Math.pow(numbC, 3)), (numbA - numbB));

        double diff = Math.abs((((numbA + numbB + numbC) / 3) - ((f1 + f2) / 2)));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff);
    }
}
