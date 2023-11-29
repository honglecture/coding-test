// https://www.acmicpc.net/problem/10821
// 정수의 개수
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(",");
        System.out.println(sArray.length);
        bw.flush();
        bw.close();
    }
    
}