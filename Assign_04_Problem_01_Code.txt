//Houzaifa Mahmoud
//20216729
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (A[i] > 0) {
                A[i] = 1;
            } else if (A[i] < 0) {
                A[i] = 2;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}


