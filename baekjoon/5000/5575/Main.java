// https://www.acmicpc.net/problem/5575
// 타임 카드
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = 3;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int h1 = Integer.parseInt(sArray[0]);
            int m1 = Integer.parseInt(sArray[1]);
            int s1 = Integer.parseInt(sArray[2]);
            int h2 = Integer.parseInt(sArray[3]);
            int m2 = Integer.parseInt(sArray[4]);
            int s2 = Integer.parseInt(sArray[5]);
            int answer1 = 0;
            int answer2 = 0;
            int answer3 = 0;
            if(s1 <= s2){
                answer3 = s2 - s1;
            } else {
                s2 += 60;
                answer3 = s2 - s1;
                m2 -= 1;
                if(m2 < 0){
                    m2 = 59;
                    h2 -= 1;
                }
            }
            if(m1 <= m2){
                answer2 = m2 - m1;
            } else {
                m2 += 60;
                answer2 = m2 - m1;
                h2 -= 1;
            }
            answer1 = h2 - h1;
            bw.write(answer1 + " " + answer2 + " " + answer3 + "\n");
        }
        bw.flush();
        bw.close();
    }
}