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
        String[] sss = ss[0].split("");
        String[] ssss = ss[1].split("");
        int a = (Integer.parseInt(sss[2]) * 100) + (Integer.parseInt(sss[1]) * 10) + (Integer.parseInt(sss[0]));
        int b = (Integer.parseInt(ssss[2]) * 100) + (Integer.parseInt(ssss[1]) * 10) + (Integer.parseInt(ssss[0]));

        if (a > b) {
            bw.write(String.valueOf(a));
        } else {
            bw.write(String.valueOf(b));
        }

        bw.close();
    }
}