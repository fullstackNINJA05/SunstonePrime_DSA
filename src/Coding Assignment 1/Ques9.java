//multiplication table of given number
import java.util.Scanner;
public class Ques9 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int i=1; i<=10; i++){
                System.out.println(n+"x"+i+"="+n*i);
            }
        }
    }
}
