// https://www.acmicpc.net/problem/26561
// Population
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            // 7초 1명 죽
            // 4초 1명 낳
            int result1 = n2 / 7;
            int result2 = n2 / 4;
            n1 -= result1;
            n1 += result2;
            bw.write(n1 + "\n");
        }
        bw.flush();
        bw.close();
    }

}
