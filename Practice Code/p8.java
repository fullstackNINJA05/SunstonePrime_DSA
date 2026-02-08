import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();

        //hollow rectangle
        for(int i=1; i<=l; i++){
            for(int j=1; j<=w; j++){
                if(i==1 || i==l || j==1 || j==w){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

    }
}
