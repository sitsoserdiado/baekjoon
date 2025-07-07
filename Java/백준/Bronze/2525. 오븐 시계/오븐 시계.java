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

        int time = Integer.parseInt(br.readLine());

        if (hour + ((minute + time) / 60) < 24){
            if (minute + time < 60) {
                bw.write(hour + " " + (minute + time));
            } else {
                bw.write(hour + ((minute + time) / 60) + " " + ((minute + time) % 60));
            }
        } else {
            bw.write((hour + ((minute + time) / 60)) - 24 + " " + ((minute + time) % 60));
        }

        bw.flush();
        bw.close();
    }
}