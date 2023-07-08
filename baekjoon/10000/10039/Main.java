// https://www.acmicpc.net/problem/10039
// 평균 점수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n <= 40){
                n = 40;
            }
            sum += n;
        }
        bw.write((sum / 5) + "\n");
        bw.flush();
        bw.close();
    }
}