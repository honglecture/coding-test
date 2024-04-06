// https://www.acmicpc.net/problem/20977
// JOI ソート (JOI Sort) 
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String str = bf.readLine();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'J'){
                count1++;
            } else if(c == 'O'){
                count2++;
            } else {
                count3++;
            }
        }
        for (int i = 0; i < count1; i++) {
            answer += "J";
        }
        for (int i = 0; i < count2; i++) {
            answer += "O";
        }
        for (int i = 0; i < count3; i++) {
            answer += "I";
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
