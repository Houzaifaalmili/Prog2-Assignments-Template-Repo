//Houzaifa Mahmoud
//20216729
import java.util.Scanner;
public class FirstDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            boolean isPrime = true;

            if (x < 2) {
                isPrime = false;
            }

            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not");
            }
        }
    }
}


