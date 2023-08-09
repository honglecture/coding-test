// https://www.acmicpc.net/problem/2576
// 홀수
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[7];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0){
                sum += array[i];
                if(min > array[i]){
                    min = array[i];
                }
            }
        }
        if(sum == 0){
            bw.write("-1\n");
        } else {
            bw.write(sum + "\n");
            bw.write(min + "\n");
        }
        bw.flush();
        bw.close();
    }
}