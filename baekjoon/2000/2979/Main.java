// https://www.acmicpc.net/problem/2979
// 트럭 주차
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int a = Integer.parseInt(sArray[0]);
        int b = Integer.parseInt(sArray[1]);
        int c = Integer.parseInt(sArray[2]);
        int[] array = new int[101];
        for (int i = 0; i < 3; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]) + 1;
            int n2 = Integer.parseInt(sArray[1]);
            for (int j = n1; j <= n2; j++) {
                array[j]++;
            }
        }
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                answer += a;
            } else if(array[i] == 2){
                answer += b * 2;
            } else if(array[i] == 3){
                answer += c * 3;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}