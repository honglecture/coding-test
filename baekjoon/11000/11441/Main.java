// https://www.acmicpc.net/problem/11441
// 합 구하기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int[] sumArray = new int[size + 1];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            sumArray[i + 1] = sumArray[i] + array[i];
        }
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int start = Integer.parseInt(sArray[0]) - 1;
            int end = Integer.parseInt(sArray[1]);
            int answer = sumArray[end] - sumArray[start];
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}