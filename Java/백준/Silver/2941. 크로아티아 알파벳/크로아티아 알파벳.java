import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        s = s.replace("c=", "1")
             .replace("c-", "1")
             .replace("dz=", "1")
             .replace("d-", "1")
             .replace("lj", "1")
             .replace("nj", "1")
             .replace("s=", "1")
             .replace("z=", "1");

        int length = s.length();

        bw.write(String.valueOf(length));
        bw.close();
    }
}