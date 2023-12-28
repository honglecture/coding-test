// https://www.acmicpc.net/problem/19698
// 헛간 청약
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int w = Integer.parseInt(sArray[1]);
        int h = Integer.parseInt(sArray[2]);
        int l = Integer.parseInt(sArray[3]);
        int n1 = w / l;
        int n2 = h / l;
        int result = n1 * n2;
        if(result <= n){
            System.out.println(result);
        } else {
            System.out.println(n);
        }
        bw.flush();
        bw.close();
    }

}