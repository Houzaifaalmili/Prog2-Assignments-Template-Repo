//Houzaifa Mahmoud
//20216729
import java.util.Scanner;
public class FirstDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int sum = 0;
            int count = 0;
            while (count < y) {
                if (x % 2 != 0) { // check if x is odd
                    sum += x;
                    count++;
                }
                x++;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}


