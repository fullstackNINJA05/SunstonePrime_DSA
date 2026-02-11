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
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int factor = 0;
        sum = digitsum(n);
        for(int i=2; i<=n; i++){
            while(n%i==0){
                if(prime(i)){
                    factor += digitsum(i);
                }
                n = n/i;
            }
        }
        System.out.println("Sum of main digits of n "+sum);
        System.out.println("Sum of prime factors of n "+factor);
        if(sum == factor){
            System.out.println("Boston");
        }
        else{
            System.out.println("Not Boston");
        }
    }
}
