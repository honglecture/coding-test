// https://www.acmicpc.net/problem/17010
// Time to Decompress
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n = Integer.parseInt(sArray[0]);
            String s = sArray[1];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(s);
            }
            bw.write(sb.toString()+"\n");
        }
        bw.flush();
        bw.close();
    }

}
