import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i, j, n = sc.nextInt();

            for(i=1; i<=n; i++){
                //spaces
                for(j=1; j<=n-i; j++){
                    System.out.print(" ");
                }
                //number
                for(j=1; j<=(2*i)-1; j++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
