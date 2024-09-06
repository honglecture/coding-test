// https://www.acmicpc.net/problem/20282
// Game Show! 
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int sum = 100;
        int max = 100;
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            sum += n;
            max = Integer.max(max, sum);
        }
        System.out.println(max);
        bw.flush();
        bw.close();
    }

}
