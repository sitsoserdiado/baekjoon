import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        final int PENNY = 1;

        int testCaseCount = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < testCaseCount; i++) {
            int change = Integer.parseInt(br.readLine());

            int quarters = change / QUARTER;
            change %= QUARTER;

            int dimes = change / DIME;
            change %= DIME;

            int nickels = change / NICKEL;
            change %= NICKEL;

            int pennies = change / PENNY;

            bw.write(quarters + " " + dimes + " " + nickels + " " + pennies + "\n");
        }

        bw.close();

    }

}
