// https://www.acmicpc.net/problem/2357
// 최솟값과 최댓값
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int[] array = new int[size1];
        for (int i = 0; i < size1; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]) - 1;
            int n2 = Integer.parseInt(sArray[1]) - 1;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = n1; j <= n2; j++) {
                int n = array[j];
                if(min > n){
                    min = n;
                }
                if(n > max){
                    max = n;
                }
            }
            bw.write(min + " " + max + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}