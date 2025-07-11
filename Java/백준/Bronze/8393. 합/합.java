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

        int sumNum = 0;
        for (int i = 1; i <= num; i++) {
            sumNum = sumNum + i;
        }

        bw.write(String.valueOf(sumNum));
        
        bw.flush();
        bw.close();
    }
}