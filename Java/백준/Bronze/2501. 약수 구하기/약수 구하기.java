import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int count = 0;
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
				if (count == k) {
					answer = i;
					break;
				}
			}
		}

		if (answer == 0) {
			bw.write("0");
		} else {
			bw.write(String.valueOf(answer));
		}

		bw.flush();

    }

}
