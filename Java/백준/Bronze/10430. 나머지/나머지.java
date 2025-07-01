import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] ss = s.split(" ");
        int a = Integer.parseInt(ss[0]);
        int b = Integer.parseInt(ss[1]);
        int c = Integer.parseInt(ss[2]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((a + b) % c + "\n");
        bw.write(((a % c) + (b % c)) % c + "\n");
        bw.write((a * b) % c + "\n");
        bw.write(((a % c) * (b % c)) % c + "\n");
        
        bw.flush();
        bw.close();
    }
}