import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int starCount = Integer.parseInt(br.readLine());

        for (int i = 0; i < starCount; i++) {
            for (int j = 0; j < starCount; j++) {
                if (j < starCount - i - 1) {
                    bw.write(" ");
                } else {
                    bw.write("*");
                }
            }
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}