import java.util.Scanner;
public class pattern12 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i, j, n = sc.nextInt();
            int p = 1;

            for(i=1; i<=n; i++){
                //spaces
                for(j=1; j<=n-i; j++){
                    System.out.print("\t");
                }
                for(j=1; j<=2*i-1; j++){
                    System.out.print(p+"\t");
                    p++;
                }
                System.out.println();
            }
        }
    }
}
