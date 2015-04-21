import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by aditim on 4/20/15.
 */
public class Diamond {
    public static void main(String[] Args) throws IOException {
        System.out.print("Enter the value of n: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println(" ");
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
