//sum of digits of given number using loop
import java.util.Scanner;
public class Ques12 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int sum = 0;

            while(n!=0){
                int digit = n % 10; // it will get last digit
                sum = sum + digit; // add in sum
                n = n/10; // it will removes last digit 
            }
            System.out.print(sum);
        }
    }
}
