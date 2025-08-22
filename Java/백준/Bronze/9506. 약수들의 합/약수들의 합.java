import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			int n = Integer.parseInt(br.readLine());

			if (n == -1) {
				break;
			}

			ArrayList<Integer> list = new ArrayList<>();
			int sum = 0;

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					list.add(i);
					sum += i;
				}
			}

			if (sum == n) {
				bw.write(n + " = ");
				for (int i = 0; i < list.size(); i++) {
					bw.write(String.valueOf(list.get(i)));

					if (i < (list.size() - 1)) {
						bw.write(" + ");
					}
				}

				bw.newLine();
			} else {
				bw.write(n + " is NOT perfect.\n");
			}
		}

		bw.flush();

    }

}
