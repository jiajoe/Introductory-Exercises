import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aditim on 4/20/15.
 */
public class DiamondWithName {
    public static void main(String[] arg) throws IOException {
        System.out.print("Enter the value of n: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n-1; i++) {
            for (int j = n - 1; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print("*");
            System.out.println(" ");
        }
        System.out.print("Aditi\n");
        for (int i = n-2; i >= 0; i--) {
            for (int j = n - 1; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < 2 * i + 1; k++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
