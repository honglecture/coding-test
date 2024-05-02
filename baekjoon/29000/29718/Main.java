// https://www.acmicpc.net/problem/29718
// 줄줄이 박수
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray =  bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        int[] tempArray = new int[x];
        int[] sumArray = new int[x + 1];
        int answer = 0;
        for (int i = 0; i < y; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int key = Integer.parseInt(bf.readLine());
        for (int i = 0; i < x; i++) {
            int sum = 0;
            for (int j = 0; j < y; j++) {
                sum += array[j][i];
            }
            tempArray[i] = sum;
        }
        for (int i = 1; i < sumArray.length; i++) {
            sumArray[i] = sumArray[i - 1] + tempArray[i - 1];
        }
        for (int i = key; i < sumArray.length; i++) {
            int result = sumArray[i] - sumArray[i - key];
            answer = Integer.max(answer, result);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
