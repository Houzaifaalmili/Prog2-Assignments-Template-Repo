//Houzaifa Mahmoud
//20216729
import java.util.Scanner;
public class FirstDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(num + " ");
            System.out.print(num + 1 + " ");
            System.out.print(num + 2 + " ");
            System.out.println("PUM");
            num += 4;
        }
    }
}


