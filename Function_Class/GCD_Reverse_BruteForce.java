import java.util.Scanner;

public class GCD_Reverse_BruteForce {
    static int gcd(int a, int b){
        for(int i = Math.min(a,b); i>=1; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
    }
}
