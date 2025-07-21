import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ss = br.readLine().split(" ");
        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);

        int[] basket = new int[n];
        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            String[] sss = br.readLine().split(" ");
            int change1 = Integer.parseInt(sss[0]);
            int change2 = Integer.parseInt(sss[1]);

            int originalNum = basket[change1 - 1];
            basket[change1 - 1] = basket[change2 - 1];
            basket[change2 - 1] = originalNum;
        }

        for (int i = 0; i < basket.length; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}