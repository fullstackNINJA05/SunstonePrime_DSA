import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int max = a[0];

        // taking input
        for (int i = 0 ; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        //logic for finding max element
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Max value is "+max);
    }
}
