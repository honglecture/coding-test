// https://www.acmicpc.net/problem/2530
// 인공지능 시계
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int h = Integer.parseInt(sArray[0]) * 60 * 60;
        int m = Integer.parseInt(sArray[1]) * 60;
        int s = Integer.parseInt(sArray[2]);
        int plus = Integer.parseInt(bf.readLine());
        int total = h + m + s + plus;
        total %= 24 * 60 * 60;
        int answerH = total / 3600;
        total = total - (answerH * 3600);
        int answerM = total / 60;
        total = total - (answerM * 60);
        int answerS = total;
        bw.write(answerH + " " + answerM + " " + answerS + "\n");
        bw.flush();
        bw.close();
    }
}