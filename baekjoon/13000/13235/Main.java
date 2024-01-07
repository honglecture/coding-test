// https://www.acmicpc.net/problem/13235
// 팰린드롬
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder(bf.readLine());
        if(sb.toString().equals(sb.reverse().toString())){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        bw.flush();
        bw.close();
    }
}