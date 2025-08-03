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
        int[] chess = new int[] {1, 1, 2, 2, 2, 8};
        int[] whiteChess = new int[chess.length];

        for (int i = 0; i < chess.length; i++) {
            whiteChess[i] = Integer.parseInt(ss[i]);

            if (chess[i] == whiteChess[i]) {
                bw.write(String.valueOf(0) + " ");
            } else {
                int remain = chess[i] - whiteChess[i];
                bw.write(String.valueOf(remain) + " ");
            }
        }

        bw.close();
    }
}