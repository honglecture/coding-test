// https://www.acmicpc.net/problem/2711
// 오타맨 고창
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n = Integer.parseInt(sArray[0]);
            StringBuilder sb = new StringBuilder(sArray[1]);
            sb.deleteCharAt(n - 1);
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }

}