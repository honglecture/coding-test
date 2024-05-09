// https://www.acmicpc.net/problem/17577
// Scores of Final Examination
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            if(y == 0){
                break;
            }
            int[][] array = new int[x][y];
            int max = 0;
            for (int i = 0; i < array.length; i++) {
                sArray = bf.readLine().split(" ");
                for (int j = 0; j < sArray.length; j++) {
                    array[i][j] = Integer.parseInt(sArray[j]);
                }
            }
            for (int i = 0; i < array[0].length; i++) {
                int sum = 0;
                for (int j = 0; j < array.length; j++) {
                    sum += array[j][i];
                }
                max = Integer.max(max, sum);
            }
            bw.write(max + "\n");
        }
        bw.flush();
        bw.close();
    }

}
