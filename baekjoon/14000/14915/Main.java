// https://www.acmicpc.net/problem/14915
// 진수 변환기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        String str = Integer.toString(n1, n2);
        System.out.println(str.toUpperCase());
        bw.flush();
        bw.close();
    }
    
}