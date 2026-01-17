//Maximum of three numbers
import java.util.Scanner;
public class Ques5 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.print(a);
        }
        else if(b>c){
            System.out.print(b);
        }
        else{
            System.out.print(c);
        }
    }
    }
}
