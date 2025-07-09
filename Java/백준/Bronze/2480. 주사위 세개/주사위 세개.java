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
        int num1 = Integer.parseInt(ss[0]);
        int num2 = Integer.parseInt(ss[1]);
        int num3 = Integer.parseInt(ss[2]);

        int prizeMoney;
        
        if (num1 == num2 && num1 == num3) {
            prizeMoney = 10000 + num1 * 1000;
        } else if (num1 == num2 || num1 == num3) {
            prizeMoney = 1000 + num1 * 100;
        } else if (num2 == num3) {
            prizeMoney = 1000 + num2 * 100;
        } else {
            int max = Math.max(num1, Math.max(num2, num3));
            prizeMoney = max * 100;
        }

        bw.write(String.valueOf(prizeMoney));

        bw.flush();
        bw.close();
    }
}