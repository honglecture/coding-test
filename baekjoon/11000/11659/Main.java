// https://www.acmicpc.net/problem/11659
// 구간 합 구하기 4
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int[] array = new int[n];
        int[] sumArray = new int[n + 1];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            if(i == 0){
                sumArray[i] = array[i];
            } else {
                sumArray[i] = sumArray[i - 1] + array[i];
            }
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int start = Integer.parseInt(sArray[0]) - 1;
            int end = Integer.parseInt(sArray[1]) - 1;
            if(start == end){
                bw.write(array[start] + "\n");
            } else {
                if(start == 0){
                    bw.write(sumArray[end] + "\n");
                } else {
                    bw.write((sumArray[end] - sumArray[start - 1]) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}