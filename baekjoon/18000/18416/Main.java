// https://www.acmicpc.net/problem/18416
// 最長昇順連続部分列 (Longest Ascending Contiguous Subsequence)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int max = 1;
        for (int i = 0; i < array.length - 1; i++) {
            int count = 1;
            int startNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if(startNum <= array[j]){
                    count++;
                    startNum = array[j];
                } else {
                    break;
                }
            }
            max = Integer.max(max, count);
        }
        System.out.println(max);
        bw.flush();
        bw.close();
    }

}
