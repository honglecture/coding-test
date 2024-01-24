// https://www.acmicpc.net/problem/12833
// XORXORXOR
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int result = n1 ^ n2;
        for (int i = 0; i < n3 - 1; i++) {
            result = result ^ n2;
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
