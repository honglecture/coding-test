// https://www.acmicpc.net/problem/29823
// Pakirobot Manhattanis
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String str = bf.readLine();
        int answer = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'W'){
                count1++;
            } else if(c == 'E'){
                count1--;
            } else if(c == 'S'){
                count2++;
            } else {
                count2--;
            }
        }
        answer = Math.abs(count1) + Math.abs(count2);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
