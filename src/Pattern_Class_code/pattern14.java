import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n = sc.nextInt();
        int p = 1;

        for (i = 1; i <= n; i++) {
            // spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // left pattern
            for (j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            // right pattern
            for (j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
