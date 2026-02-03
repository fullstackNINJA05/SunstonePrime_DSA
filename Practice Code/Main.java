import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i, j, n = sc.nextInt();
		
		for(i=1; i<=n; i++){
			//left part
            for(j=1; j<=i; j++){
                System.out.print(j+"\t");
            }
			//space
			for(j=1; j<=2*(n-i)-1; j++){
				System.out.print("\t");
			}
            //right part
			for(j=i; j>=1; j--){
				if(j!=n){ 
					System.out.print(j+"\t");
				}
            }

            System.out.println();
        }

		

    }
}