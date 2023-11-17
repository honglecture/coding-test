// https://www.acmicpc.net/problem/10822
// 더하기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(",");
        int sum = 0;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            sum += n;
        }
        bw.write(sum +"\n");
        bw.flush();
        bw.close();
    }
    
}