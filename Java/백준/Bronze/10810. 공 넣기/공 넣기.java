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

        int[] write = new int[n];

        for (int i = 0; i < m; i++) {
            String[] sss = br.readLine().split(" ");
            int a = Integer.parseInt(sss[0]);
            int b = Integer.parseInt(sss[1]);
            int c = Integer.parseInt(sss[2]);

            for (int j = a; j <= b; j++) {
                write[j - 1] = c;
            }
        }

        for (int i = 0; i < write.length; i++) {
            bw.write(write[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}