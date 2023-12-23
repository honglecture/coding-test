// https://www.acmicpc.net/problem/14490
// 백대열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split("\\:");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n = 2;
        while (true) {
            if(n1 < n || n2 < n){
                break;
            }
            if(n1 % n == 0 && n2 % n == 0){
                n1 /= n;
                n2 /= n;
            } else {
                n++;
            }
        }
        bw.write(n1 + ":" + n2 + "\n");
        bw.flush();
        bw.close();
    }
}