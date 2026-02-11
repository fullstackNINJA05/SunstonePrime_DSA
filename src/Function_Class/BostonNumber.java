import java.util.*;

public class BostonNumber {
    static int digitsum(int n){
        int sum = 0;
        while(n!=0){
            int k = n%10;
            sum += k;
            n /= 10;
        }
        return sum;
    }
    static boolean prime(int n){
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int factor = 0;
    }
}
