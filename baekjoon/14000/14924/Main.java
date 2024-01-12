// https://www.acmicpc.net/problem/14924
// 폰 노이만과 파리
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int result1 = n3 / (n1 * 2);
        int result2 = result1 * n2;
        System.out.println(result2);
        bw.flush();
        bw.close();
    }
    
}