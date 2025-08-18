import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
		int n = 1;

		while (x > n * (n + 1) / 2) {
			n++;
		}

		int pos = x - (n - 1) * n / 2;
		int numerator, denominator;

		if (n % 2 == 0) {
			numerator = pos;
			denominator = n - pos + 1;
		} else {
			numerator = n - pos + 1;
			denominator = pos;
		}

		bw.write(numerator + "/" + denominator);
		bw.flush();

    }

}
