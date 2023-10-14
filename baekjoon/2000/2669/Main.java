// https://www.acmicpc.net/problem/2669
// 직사각형 네개의 합집합의 면적 구하기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[][] array = new boolean[101][101];
        for (int i = 0; i < 4; i++) {
            String[] sArray = bf.readLine().split(" ");
            int x1 = Integer.parseInt(sArray[0]);
            int y1 = Integer.parseInt(sArray[1]);
            int x2 = Integer.parseInt(sArray[2]);
            int y2 = Integer.parseInt(sArray[3]);
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    array[j][k] = true;
                }
            }
        }
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]){
                    answer++;
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}