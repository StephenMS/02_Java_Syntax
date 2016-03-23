import java.util.Scanner;

/**
 * Created by stoya on 23.3.2016 г..
 */
public class p09HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int theTarget = input.nextInt();

        for (int i = 1; i <= 20; i++){
            for (int j = 1; j <= 20; j++){
                if ((i + j) == theTarget) {
                    // result via add found
                    System.out.printf("%d + %d = %d\n", i, j, i + j);
                } else if ((i - j) == theTarget) {
                    // result via substract found
                    System.out.printf("%d - %d = %d\n", i, j, i - j);
                }
            }
        }
    }
}
