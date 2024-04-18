// https://www.acmicpc.net/problem/4287
// Word Ratios
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
            String[] sArray = str.split(" ");
            String s1 = sArray[0];
            String s2 = sArray[1];
            String s3 = sArray[2];
            String answer = "";
            for (int i = 0; i < s1.length(); i++) {
                int n1 = s1.charAt(i) - 97;
                int n2 = s2.charAt(i) - 97;
                int n3 = s3.charAt(i) - 97;
                int size = n2 - n1;
                int n4 = n3 + size;
                if(n4 < 0){
                    n4 += 26;
                } else if(n4 > 25){
                    n4 -= 26;
                }
                answer += String.valueOf((char)(n4 + 97));
            }
            bw.write(s1 + " " + s2 + " " + s3 + " " + answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}