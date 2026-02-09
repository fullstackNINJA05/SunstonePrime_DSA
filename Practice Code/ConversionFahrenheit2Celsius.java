
import java.util.*;

public class ConversionFahrenheit2Celsius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MinF = sc.nextInt();
        int MaxF = sc.nextInt();
        int step = sc.nextInt();

        for (int i = MinF; i <= MaxF; i += step) {
            double celsius = (int)((5.0 / 9) * (i - 32)); 
            System.out.println(i +"\t"+celsius);
        }
    }
}
