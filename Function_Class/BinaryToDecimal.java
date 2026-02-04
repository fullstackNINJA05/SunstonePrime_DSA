import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g =0, sum=0;
        while(n>0){
            int k = n%2;
            sum += k*Math.pow(2,g);
            g++;
            n= n/10;
        }
        System.out.println(sum);
    }
}
