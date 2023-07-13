// https://www.acmicpc.net/problem/1654
// 랜선 자르기

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
        int target = Integer.parseInt(sArray[1]);
        int[] array = new int[size];
        long result = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        long start = array[size - 1];
        long end = 1;
        while(true){
            long mid = (start + end) / 2;
            long sum = 0;
            if(start < end){
                break;
            }
            for (int i = array.length - 1; i >= 0; i--) {
                sum += array[i] / mid;
            }
            if(target > sum){
                start = mid - 1;
            } else {
                if(mid > result){
                    result = mid;
                }
                end = mid + 1;
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

}
