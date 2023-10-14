// https://www.acmicpc.net/problem/13300
// 방 배정
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        int[][] array = new int[7][2];
        int answer = 0;
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[n2][n1]++;
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int n = array[i][j];
                if(n == 0){
                    continue;
                }
                if(k >= n){
                    answer++;
                } else {
                    if(n % k == 0){
                        answer += n / k;
                    } else {
                        answer += n / k + 1;
                    }
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}