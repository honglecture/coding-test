// https://www.acmicpc.net/problem/10103
// 주사위 게임
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int m = 100;
        int n = 100;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 > n2){
                n-=n1;
            } else if(n1 < n2){
                m-=n2;
            }
        }
        bw.write(m + "\n");
        bw.write(n + "\n");
        bw.flush();
        bw.close();
    }
}