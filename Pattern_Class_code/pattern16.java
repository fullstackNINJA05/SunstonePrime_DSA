import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n = sc.nextInt();

        for(i=1; i<=n; i++){
            for(j=1; j<=2*i-1; j++){
                if(j%2==0){
                    //star
                    System.out.print("* ");
                }
                else{
                    //number
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

        for(i=n-1; i>=1; i--){
            for(j=1; j<=2*i-1; j++){
                if(j%2==0){
                    //star
                    System.out.print("* ");
                }
                else{
                    //number
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
