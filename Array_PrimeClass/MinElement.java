import java.util.Scanner;
public class MinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        // taking input
        for (int i = 0 ; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        //logic for finding max element
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
               min = a[i];
            }
        }
        System.out.println("Min value is "+min);
    }
}


