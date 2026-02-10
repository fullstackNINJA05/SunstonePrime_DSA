import java.util.Scanner;
public class pattern13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j , n = sc.nextInt();

        for(i=1; i<=n; i++){
            //spaces
            for(j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //left pattern
            for(j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            //right pattern
            for(j=i-1; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    } 
}
