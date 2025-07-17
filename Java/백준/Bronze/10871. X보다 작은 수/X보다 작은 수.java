import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ss = br.readLine().split(" ");
        int n = Integer.parseInt(ss[0]);
        int x = Integer.parseInt(ss[1]);

        String[] ss2 = br.readLine().split(" ");
        for (int i = 0; i < ss2.length; i++) {
            if (Integer.parseInt(ss2[i]) < x) {
                bw.write(Integer.parseInt(ss2[i]) + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}