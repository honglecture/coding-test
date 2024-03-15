// https://www.acmicpc.net/problem/22113
// 창영이와 버스
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        int[] array = new int[size2];
        sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int[][] boardArray = new int[size1][size1];
        for (int i = 0; i < boardArray.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                boardArray[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            int n1 = array[i];
            int n2 = array[i + 1];
            answer += boardArray[n1 - 1][n2 - 1];
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
