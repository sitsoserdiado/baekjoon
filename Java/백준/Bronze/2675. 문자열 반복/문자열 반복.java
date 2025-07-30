import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCount = Integer.parseInt(br.readLine());

        int repeatCount;
        String s;

        for (int i = 0; i < testCount; i++) {
            String[] ss = br.readLine().split(" ");
            repeatCount = Integer.parseInt(ss[0]);
            s = ss[1];

            String[] sss = s.split("");

            for (int j = 0; j < sss.length; j++) {
                for (int k = 0; k < repeatCount; k++) {
                    bw.write(sss[j]);
                }
            }
            bw.newLine();
        }
        bw.close();
    }
}