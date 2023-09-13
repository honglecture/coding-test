// https://www.acmicpc.net/problem/1049
// 기타줄

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        int[][] array = new int[size][2];
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            array[i][0] = Integer.parseInt(sArray[0]);
            array[i][1] = Integer.parseInt(sArray[1]);
        }
        int pkgMin = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            int n1 = array[i][0];
            int n2 = array[i][1];
            if(pkgMin > n1){
                pkgMin = n1;
            }
            if(min > n2){
                min = n2;
            }
        }
        if(min * 6 < pkgMin){
            answer = min * n;
        } else {
            if(n % 6 == 0){
                answer = (n / 6) * pkgMin;
            } else {
                answer = Integer.min((n / 6 + 1) * pkgMin, ((n / 6) * pkgMin) + ((n % 6) * min));
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}