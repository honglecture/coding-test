// https://www.acmicpc.net/problem/9655
// 돌 게임
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        if(n % 2 == 1){
            bw.write("SK\n");
        } else {
            bw.write("CY\n");
        }
        bw.flush();
        bw.close();
    }
}