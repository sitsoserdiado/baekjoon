import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] students = new int[30];
        for (int i = 0; i < students.length; i++) {
            students[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            int studentNum = Integer.parseInt(br.readLine());
            students[studentNum - 1] = 0;
        }

        for (int j = 0; j < students.length; j++) {
            if (students[j] != 0) {
                bw.write(students[j] + "\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}