// https://www.acmicpc.net/problem/9656
// 돌 게임2
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        if(n % 2 == 1){
            bw.write("CY\n");
        } else {
            bw.write("SK\n");
        }
        bw.flush();
        bw.close();
    }
}