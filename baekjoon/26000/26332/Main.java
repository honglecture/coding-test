// https://www.acmicpc.net/problem/26332
// Buying in Bulk
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
            int sum = n1 * n2;
            sum -= (n1 - 1) * 2;
            bw.write(n1 + " " + n2 + "\n");
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }

}
