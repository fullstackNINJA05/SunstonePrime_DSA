//calculating simple interest
import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int SI = (p*r*t)/100;
        System.out.println(SI);
        }
    }
}
