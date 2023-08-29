// https://www.acmicpc.net/problem/1644
// 소수의 연속합

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;  

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        int count = 0;
        list.add(2);
        for (int i = 2; i <= 4000000; i++) {
            boolean flag = true;
            if(i % 2 == 0){
                continue;
            }
            for (int j = 3; j <= Math.sqrt(i); j+=2) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(i);
            }
        }
        long[] array = new long[list.size() + 1];
        for (int i = 1; i < array.length; i++) {
            array[i] = list.get(i - 1) + array[i - 1]; 
        }
        int startIndex = 0;
        int endIndex = 0;
        while(true){
            long result = array[endIndex] - array[startIndex];
            if(result == n){
                count++;
                endIndex++;
                if(endIndex > array.length - 1){
                    break;
                }
            } else if(result > n){
                startIndex++;
                if(startIndex > array.length - 1){
                    break;
                }
            } else if(result < n){
                endIndex++;
                if(endIndex > array.length - 1){
                    break;
                }
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}
