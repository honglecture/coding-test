// https://www.acmicpc.net/problem/5789
// 한다 안한다
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
            int index = str.length() / 2 - 1;
            char c1 = str.charAt(index);
            char c2 = str.charAt(index + 1);
            if(c1 == c2){
                bw.write("Do-it\n");
            } else {
                bw.write("Do-it-Not\n");
            }
        }
        bw.flush();
        bw.close();
    }
}