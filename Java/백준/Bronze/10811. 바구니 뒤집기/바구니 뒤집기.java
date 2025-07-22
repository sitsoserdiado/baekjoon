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
        int n = Integer.parseInt(ss[0]);
        int m = Integer.parseInt(ss[1]);

        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            String[] sss = br.readLine().split(" ");
            int a = Integer.parseInt(sss[0]);
            int b = Integer.parseInt(sss[1]);

            int start = a - 1;
            int end = b - 1;

            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            bw.write(nums[i] + " ");
        }
        bw.close();
    }
}