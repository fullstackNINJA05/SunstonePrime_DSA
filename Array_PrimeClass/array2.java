import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);

        // taking input
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // output
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
