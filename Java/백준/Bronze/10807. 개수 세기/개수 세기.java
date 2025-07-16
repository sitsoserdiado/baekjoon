import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String[] ss = br.readLine().split(" ");
        String s = br.readLine();

        int findNums = 0;
        for (int i = 0; i < ss.length; i++) {
            if (ss[i].equals(s)) {
                findNums++;
            }
        }

        bw.write(String.valueOf(findNums));

        bw.flush();
        bw.close();
    }
}