import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(br.readLine());
        int two = Integer.parseInt(br.readLine());
        int three = one * (two % 10);
        int four = one * ((two - (100 * (two / 100))) / 10);
        int five = one * (two / 100);
        int six = (100 * five) + (10 * four) + three;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(three + "\n");
        bw.write(four + "\n");
        bw.write(five + "\n");
        bw.write(six + "\n");

        bw.flush();
        bw.close();
    }
}