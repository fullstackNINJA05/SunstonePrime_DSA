//Grade card program(based on marks)

import java.util.Scanner;
public class Ques6 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        int marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("A");
        }
        else if(75<= marks && marks<90){
            System.out.println("B");
        }
        else if(60<= marks && marks<75){
            System.out.println("C");
        }
        else if(50<= marks && marks<60){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");
        }
        }    
    }
}
