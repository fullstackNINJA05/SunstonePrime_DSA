//factorial of given number
import java.util.Scanner;
public class Ques10{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int i, fact = 1;
            for(i=1; i<=n; i++){
                fact = fact*i;
            }
            System.out.println(fact);
        }
    }
}
