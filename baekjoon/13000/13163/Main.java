// https://www.acmicpc.net/problem/13163
// 닉네임에 갓 붙이기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < sArray.length; j++) {
                sb.append(sArray[j]);
            }
            bw.write("god" + sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}