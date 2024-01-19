// https://www.acmicpc.net/problem/26545
// Mathematics
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += Integer.parseInt(bf.readLine());
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

}
