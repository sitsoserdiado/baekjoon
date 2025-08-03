import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num * 2 - 1; i++) {
            int spaceCount, starCount;

            if (i < num) {
                spaceCount = num - i - 1;
                starCount = i * 2 + 1;
            } else {
                spaceCount = i - num + 1;
                starCount = (num * 2 - 1) - 2 * (i - num + 1);
            }

            for (int k = 0; k < spaceCount; k++) {
                bw.write(" ");
            }
            for (int k = 0; k < starCount; k++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.close();
    }
}