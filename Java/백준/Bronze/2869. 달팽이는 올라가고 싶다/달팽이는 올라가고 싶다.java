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
		int a = Integer.parseInt(ss[0]);
		int b = Integer.parseInt(ss[1]);
		int v = Integer.parseInt(ss[2]);

		int days = (v - a) / (a - b) + 1;

		if ((v - a) % (a - b) != 0) {
			days++;
		}

		bw.write(String.valueOf(days));
		bw.flush();

    }

}
