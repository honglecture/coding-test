// https://www.acmicpc.net/problem/1592
// 영식이와 친구들

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int l = Integer.parseInt(sArray[2]);
        int[] array = new int[n + 1];
        int currentIndex = 1;
        int answer = 0;
        while (true) {
            int count = array[currentIndex] + 1;
            if(count == m){
                break;
            }
            answer++;
            array[currentIndex] = count;
            if(count % 2 == 1){
                currentIndex += l;
                if(currentIndex > n){
                    currentIndex -= n;
                }
            } else {
                currentIndex -= l;
                if(currentIndex < 1){
                    currentIndex += n;
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


}
