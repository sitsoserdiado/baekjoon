import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double totalPoints = 0.0;
        double totalCredits = 0.0;

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            String grade = input[2];

            if (grade.equals("P")) continue;

            double credit = Double.parseDouble(input[1]);
            double point = 0.0;

            switch (grade) {
                case "A+": point = 4.5; break;
                case "A0": point = 4.0; break;
                case "B+": point = 3.5; break;
                case "B0": point = 3.0; break;
                case "C+": point = 2.5; break;
                case "C0": point = 2.0; break;
                case "D+": point = 1.5; break;
                case "D0": point = 1.0; break;
                case "F":  point = 0.0; break;
            }

            totalCredits += credit;
            totalPoints += credit * point;
        }

        double gpa = totalPoints / totalCredits;

        bw.write(String.valueOf(gpa));
        bw.close();
    }
}