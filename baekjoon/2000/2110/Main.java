// https://www.acmicpc.net/problem/2110
// 공유기 설치
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int count = Integer.parseInt(sArray[1]);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        int start = 0;
        int end = array[array.length - 1];
        while(true){
            int mid = (start + end) / 2;
            int result = mid - 1;
            for (int i = 1; i < array.length; i++) {
                
            }
            break;
        }
        bw.flush();
        bw.close();
    }
}