import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by aditim on 4/20/15.
 */
public class PrimeFactors {
    public static void generate(int n) {
        int count;
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                count = 0;
                for (int j = 2; j <= (i / 2); j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0)
                    System.out.print(i+" ");
            }

        }

    }

    public static void main(String[] args) throws IOException {
        int n;
        System.out.print("Enter the number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        generate(n);
    }
}
