// https://www.acmicpc.net/problem/2386
// 도비의 영어 공부
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("#")){
                break;
            }
            String s1 = str.substring(0, 1).toLowerCase();
            String s2 = str.substring(1).toLowerCase();
            int count = 0;
            for (int i = 0; i < s2.length(); i++) {
                String s = String.valueOf(s2.charAt(i));
                if(s.equals(s1)){
                    count++;
                }
            }
            bw.write(s1 + " " + count + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}