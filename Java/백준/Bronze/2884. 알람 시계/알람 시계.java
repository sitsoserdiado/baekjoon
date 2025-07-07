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
        int hour = Integer.parseInt(ss[0]);
        int minute = Integer.parseInt(ss[1]);

        if (minute >= 45) {
            bw.write(hour + " " + (minute - 45));
        } else if (hour != 0) {
            bw.write((hour - 1) + " " + ((60 + minute) - 45));
        } else {
            bw.write((hour + 23) + " " + ((60 + minute) - 45));
        }

        bw.flush();
        bw.close();
    }
}