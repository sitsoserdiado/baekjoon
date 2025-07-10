import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalAmount = Integer.parseInt(br.readLine());
        int numberOfTypes = Integer.parseInt(br.readLine());
        int sumPrice = 0;
        for (int i = 0; i < numberOfTypes; i++) {
            String[] ss = br.readLine().split(" ");
            int price = Integer.parseInt(ss[0]);
            int count = Integer.parseInt(ss[1]);
            sumPrice = sumPrice + (price * count);
        }

        if (totalAmount == sumPrice) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
    }
}