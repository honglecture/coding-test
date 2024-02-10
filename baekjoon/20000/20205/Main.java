// https://www.acmicpc.net/problem/20205
// 교수님 그림이 깨지는데요?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        int[][] array = new int[n][n];
        int[][] answerArray = new int[n * k][n * k];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i][j] == 1){
                    int y = i * k;
                    int x = j * k;
                    for (int l = y; l < y + k; l++) {
                        for (int m = x; m < x + k; m++) {
                            answerArray[l][m] = 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray.length; j++) {
                bw.write(answerArray[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
