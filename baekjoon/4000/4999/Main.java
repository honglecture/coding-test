// https://www.acmicpc.net/problem/4999
// 아!
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        String answer = "go";
        if(str1.length() < str2.length()){
            answer = "no";
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}
