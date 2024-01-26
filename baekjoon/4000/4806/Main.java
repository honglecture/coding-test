// https://www.acmicpc.net/problem/4806
// 줄 세기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        while (true) {
            String str = bf.readLine();
            if(str == null ||str.equals("")){
                break;
            }
            count++;
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }
}