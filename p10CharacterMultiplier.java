import java.util.Scanner;

/**
 * Created by stoya on 23.3.2016 г..
 */
public class p10CharacterMultiplier {

    public static int SumCharacterCodes(String str1, String str2) {
        int result = 0;
        int length1 = str1.length();
        int length2 = str2.length();
        int range = length1 <= length2 ? length1 : length2; // take string with smaller lenght
        int code1, code2 = 0;
        for (int i = 0; i < range; i++) {
            code1 = str1.charAt(i);
            code2 = str2.charAt(i);
            result += code1 * code2;
        }

        if (length1 != length2) {
            // two strings had different lengths - must add few values to the result
            if (length1 > length2){
                // first string is longer
                for (int i = range; i < length1; i++) {
                    result += str1.charAt(i);
                }
            } else {
                // second string is longer
                for (int i = range; i < length2; i++) {
                    result += str2.charAt(i);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1 = input.next();
        String string2 = input.next();
        System.out.println(SumCharacterCodes(string1, string2));
    }
}
