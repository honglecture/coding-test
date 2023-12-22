// https://www.acmicpc.net/problem/10801
// 카드게임
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < sArray1.length; i++) {
            int n1 = Integer.parseInt(sArray1[i]);
            int n2 = Integer.parseInt(sArray2[i]);
            if(n1 > n2){
                result1++;
            } else if(n1 < n2){
                result2++;
            }
        }
        if(result1 > result2){
            System.out.println("A");
        } else if(result1 < result2){
            System.out.println("B");
        } else {
            System.out.println("D");
        }
        bw.flush();
        bw.close();
    }

}