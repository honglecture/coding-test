// https://www.acmicpc.net/problem/2852
// NBA 농구
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int score1 = 0;
        int score2 = 0;
        int time1 = 0;
        int time2 = 0;
        int currentTime = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int score = Integer.parseInt(sArray[0]);
            String[] str = sArray[1].split("\\:");
            int time = Integer.parseInt(str[0]) * 60 + Integer.parseInt(str[1]);
            if(score1 == score2){
            } else if(score1 >  score2){
                time1 += time - currentTime;
            } else {
                time2 += time - currentTime;
            }
            if(score == 1){
                score1 += 1;
            } else if(score == 2){
                score2 += 1;
            }
            currentTime = time;
        }
        if(score1 == score2){
        } else if(score1 >  score2){
            time1 += 2880 - currentTime;
        } else {
            time2 += 2880 - currentTime;
        }
        String result1 = "";
        String result2 = "";
        String m1 = time1 / 60 + "";
        String s1 = time1 % 60 + "";
        String m2 = time2 / 60 + "";
        String s2 = time2 % 60 + "";
        if(m1.length() == 1){
            m1 = "0" + m1;
        }
        if(s1.length() == 1){
            s1 = "0" + s1;
        }
        result1 = m1 + ":" + s1;
        if(m2.length() == 1){
            m2 = "0" + m2;
        }
        if(s2.length() == 1){
            s2 = "0" + s2;
        }
        result1 = m1 + ":" + s1;
        result2 = m2 + ":" + s2;
        System.out.println(result1);
        System.out.println(result2);
        bw.flush();
        bw.close();
    }
}