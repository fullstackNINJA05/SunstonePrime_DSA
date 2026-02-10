import java.util.Scanner;
public class pattern10 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i, j, m = sc.nextInt();
            int n = (m+1)/2;

            for(i=1; i<=n-i; i++){
                //left star
                for(j=1; j<=n-i; j++){
                    System.out.print("* ");
                }
                //spaces
                for(j=1; j<=2*i; j++){
                    System.out.print("  ");
                }
                //right star
                for(j=1; j<=n-i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(i=n-1; i>=1; i--){
                //left star
                for(j=1; j<=n-i; j++){
                    System.out.print("* ");
                }
                //spaces
                for(j=1; j<=2*i; j++){
                    System.out.print("  ");
                }
                //right star
                for(j=1; j<=n-i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
