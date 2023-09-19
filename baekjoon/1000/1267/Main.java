// https://www.acmicpc.net/problem/1267
// 핸드폰 요금

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(n % 30 == 0){
                result1 += (n / 30 + 1) * 10;
            } else {
                result1 += (n / 30 + 1) * 10;
            }
            if(n % 60 == 0){
                result2 += (n / 60 + 1) * 15;
            } else {
                result2 += (n / 60 + 1) * 15;
            }
        }
        if(result1 > result2){
            bw.write("M " + result2 + "\n");
        } else if(result2 > result1){
            bw.write("Y " + result1 + "\n");
        } else {
            bw.write("Y M " + result1 + "\n");
        }
        bw.flush();
        bw.close();
    }
}