import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxValue = -1;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < 9; i++) {
            String[] row = br.readLine().split(" ");

            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(row[j]);

                if (num > maxValue) {
                    maxValue = num;
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }

        bw.write(maxValue + "\n" + maxRow + " " + maxCol);
        bw.close();
    }
}