// https://www.acmicpc.net/problem/1051
// 숫자 정사각형

import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        int answer = 1;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int start = 1;
                while(true){
                    if(i + start > array.length - 1){
                        break;
                    }
                    if(j + start > array[0].length - 1){
                        break;
                    }
                    int n1 = array[i][j];
                    int n2 = array[i + start][j];
                    int n3 = array[i][j + start];
                    int n4 = array[i + start][j + start];
                    if(n1 == n2 && n1 == n3 && n1 == n4){
                        int result = (start + 1) * (start + 1);
                        if(answer < result){
                            answer = result;
                        }
                    }
                    start++;
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}