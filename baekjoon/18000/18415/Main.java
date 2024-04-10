// https://www.acmicpc.net/problem/18415
// キャピタリゼーション (Capitalization)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine().replaceAll("joi", "JOI");
        System.out.println(str);
        bw.flush();
        bw.close();
    }

}
