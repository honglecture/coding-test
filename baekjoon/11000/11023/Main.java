// https://www.acmicpc.net/problem/11023
// 더하기 3
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            answer += Integer.parseInt(sArray[i]);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}