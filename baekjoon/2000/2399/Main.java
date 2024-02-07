// https://www.acmicpc.net/problem/2399
// 거리의 합
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        long sum = 0;
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                long result = Math.abs(array[i] - array[j]);
                sum += result;
            }
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }
    
}