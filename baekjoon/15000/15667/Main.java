// https://www.acmicpc.net/problem/15667
// 2018 연세대학교 프로그래밍 경진대회
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine()) - 1;
        int answer = 1;
        while (true) {
            int num = n - answer;
            if(answer * answer == num){
                break;
            }
            answer++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}