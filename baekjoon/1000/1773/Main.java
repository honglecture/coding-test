// https://www.acmicpc.net/problem/1773
// 폭죽쇼

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
        int size = Integer.parseInt(sArray[0]);
        int s = Integer.parseInt(sArray[1]);
        boolean[] array = new boolean[s + 1];
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            for (int j = n; j <= s; j += n) {
                array[j] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]){
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
   
}



