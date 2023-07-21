// https://www.acmicpc.net/problem/10699
// ACM 호텔
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        String nowDate = sdf.format(now);
        bw.write(nowDate + "\n");
        bw.flush();
        bw.close();
    }

}