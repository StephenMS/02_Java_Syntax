import java.util.Scanner;

/**
 * Created by stoya on 18.3.2016 г..
 *
 * Write a program that enters 3 points in the plane (as integer x and y coordinates),
 * calculates and prints the area of the triangle composed by these 3 points. Round the
 * result to a whole number. In case the three points do not form a triangle, print "0" as result.
 */

public class p02TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        // find the distance between three points (sides of triangle)
        double aSide = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2,2));
        double bSide = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3,2));
        double cSide = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2));

        double halfPerimeter = (aSide + bSide + cSide) / 2;

        double triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - aSide) *
                (halfPerimeter - bSide) * (halfPerimeter - cSide));


        System.out.printf("%.0f\n", triangleArea);
    }
}
