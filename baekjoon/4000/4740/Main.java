// https://www.acmicpc.net/problem/4740
// 거울, 오! 거울
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
            StringBuilder sb = new StringBuilder(bf.readLine());
            if(sb.toString().equals("***")){
                break;
            }
            bw.write(sb.reverse() + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}