// https://www.acmicpc.net/problem/16507
// 어두운 건 무서워
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int size = Integer.parseInt(sArray[2]);
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int startY = Integer.parseInt(sArray[0]) - 1;
            int startX = Integer.parseInt(sArray[1]) - 1;
            int endY = Integer.parseInt(sArray[2]) - 1;
            int endX = Integer.parseInt(sArray[3]) - 1;
            int sum = 0;
            int count = 0;
            for (int j = startY; j <= endY; j++) {
                for (int k = startX; k <= endX; k++) {
                    sum += array[j][k];
                    count++;
                }
            }
            int answer = sum / count;
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    


}
