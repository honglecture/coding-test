// https://www.acmicpc.net/problem/17247
// 택시 거리
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
            }
        }
        int y1 = -1;
        int x1 = -1;
        int y2 = -1;
        int x2 = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 1){
                    if(y1 == -1){
                        y1 = i;
                        x1 = j;
                    } else {
                        y2 = i;
                        x2 = j;
                    }
                }
            }
        }
        int answer = Math.abs(y2 - y1) + Math.abs(x2 - x1);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
