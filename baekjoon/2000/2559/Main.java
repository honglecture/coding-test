// https://www.acmicpc.net/problem/2559
// 수열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int n = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        int answer = sum;
        for (int i = n; i < array.length; i++) {
            sum -= array[i - n];
            sum += array[i];
            if(sum > answer){
                answer = sum;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}