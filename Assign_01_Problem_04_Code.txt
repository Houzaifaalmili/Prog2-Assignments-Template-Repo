//Houzaifa Mahmoud
//20216729
import java.util.Scanner;

public class SortAndPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int smallest, middle, largest;

        if (A <= B && A <= C) {
            smallest = A;
            if (B <= C) {
                middle = B;
                largest = C;
            } else {
                middle = C;
                largest = B;
            }
        } else if (B <= A && B <= C) {
            smallest = B;
            if (A <= C) {
                middle = A;
                largest = C;
            } else {
                middle = C;
                largest = A;
            }
        } else {
            smallest = C;
            if (A <= B) {
                middle = A;
                largest = B;
            } else {
                middle = B;
                largest = A;
            }
        }

        System.out.println(smallest);
        System.out.println(middle);
        System.out.println(largest);


        System.out.println();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
