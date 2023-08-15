// https://www.acmicpc.net/problem/10156
// 과자
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int sum = array[0] * array[1];
        int answer = 0;
        if(sum > array[2]){
            answer = sum - array[2];
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}