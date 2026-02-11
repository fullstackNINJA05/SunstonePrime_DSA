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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
