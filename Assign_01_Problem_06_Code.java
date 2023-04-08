//Houzaifa Mahmoud
//20216729
import java.util.Scanner;

public class FirstDigitCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str =scanner.next();
        int FirstDigit =Character.getNumericValue(str.charAt(0));
        if (FirstDigit % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}

