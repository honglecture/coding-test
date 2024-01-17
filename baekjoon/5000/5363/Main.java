// https://www.acmicpc.net/problem/5363
// 요다
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for (int j = 2; j < sArray.length; j++) {
                sb.append(sArray[j] + " ");
            }
            sb.append(sArray[0] + " ");
            sb.append(sArray[1]);
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}