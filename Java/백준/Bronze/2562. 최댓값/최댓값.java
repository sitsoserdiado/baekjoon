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

        int[] nums = new int[9];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        int max = Arrays.stream(nums).max().getAsInt();
        bw.write(max + "\n");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                bw.write(String.valueOf(i + 1));
            }
        }

        bw.flush();
        bw.close();
    }
}