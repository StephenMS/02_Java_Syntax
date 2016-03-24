import java.util.Scanner;

/**
 * Created by stoya on 18.3.2016 г..
 *
 * Write a program that enters the sides of a rectangle (two integers a and b)
 * and calculates and prints the rectangle's area
 */
public class p01RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aSide = input.nextInt();
        int bSide = input.nextInt();
        int rectangleArea = aSide * bSide;

        System.out.println(rectangleArea);

	   // comment
    }
}
