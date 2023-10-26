// https://www.acmicpc.net/problem/2018
// 수들의 합 5
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;
        int[] array = new int[n + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int index = n;
        while(true){
            int sum = 0;
            for (int i = index; i >= 1; i--) {
                sum += array[i];
                if(sum == n){
                    answer++;
                    break;
                }
                if(sum > n){
                    break;
                }
            }
            if(sum < n){
                break;
            }
            if(index == 0){
                break;
            }
            index--;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


}