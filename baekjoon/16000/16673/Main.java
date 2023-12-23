// https://www.acmicpc.net/problem/16673
// 고려대학교에는 공식 와인이 있다
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int c = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        int p = Integer.parseInt(sArray[2]);
        int answer = 0;
        for (int i = 1; i <= c; i++) {
            answer += (k * i) + (p * (i * i));
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
