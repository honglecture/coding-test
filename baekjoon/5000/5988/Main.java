// https://www.acmicpc.net/problem/5988
// 홀수일까 짝수일까
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            if(Integer.parseInt(String.valueOf(str.charAt(str.length() - 1))) % 2 == 0){
                 bw.write("even\n");
            } else {
                bw.write("odd\n");
            }
        }
        bw.flush();
        bw.close();
    }
}