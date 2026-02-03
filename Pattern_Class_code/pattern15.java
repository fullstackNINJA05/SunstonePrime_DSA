import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n = sc.nextInt();

        for (i = 1; i <= n; i++) {

            for (j = n; j >= 1; j--) {
                if (j == i) {
                    //star
                    System.out.print("* ");
                } else {
                    //number
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
