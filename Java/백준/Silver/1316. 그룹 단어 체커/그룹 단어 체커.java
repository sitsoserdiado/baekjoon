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
        int answer = count;

        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            boolean[] visited = new boolean[26];
            char prev = 0;
            boolean isValid = true;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                if (c != prev) {
                    if (visited[c - 'a']) {
                        isValid = false;
                        break;
                    }

                    visited[c - 'a'] = true;
                }

                prev = c;
            }

            if (!isValid) {
                answer--;
            }
        }

        bw.write(String.valueOf(answer));
        bw.close();
    }
}