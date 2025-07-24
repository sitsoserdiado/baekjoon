import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] ss = br.readLine().split(" ");

        int[] scores = new int[n];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(ss[i]);
        }

        double highestScore = Arrays.stream(scores).max().getAsInt();

        double[] newScore = new double[n];
        for (int i = 0; i < scores.length; i++) {
            newScore[i] = scores[i] / highestScore * 100;
        }

        double sumNewScore = Arrays.stream(newScore).sum();

        bw.write(Double.toString(sumNewScore / n));
        bw.close();
    }
}