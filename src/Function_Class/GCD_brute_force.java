import static java.lang.Double.min;
import java.util.Scanner;

public class GCD_brute_force {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        for(int i=1; i<= min(a,b); i++){
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }
        System.out.print(ans);
    }
}

// but this is not suitable for large numbers.
