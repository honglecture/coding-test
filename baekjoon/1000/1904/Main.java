// https://www.acmicpc.net/problem/1904
// 01타일

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
        int[] array = new int[1000001];
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 5;
        for (int i = 5; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
            array[i] = array[i] % 15746;
        }
        bw.write(array[n] + "\n");
        bw.flush();
        bw.close();
    }
}
