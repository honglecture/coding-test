// https://www.acmicpc.net/problem/30585
// Поп-ит
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int[][] array = new int[y][x];
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = Integer.parseInt(sArray[j]);
                if(array[i][j] == 0){
                    count0++;
                } else {
                    count1++;
                }
            }
        }
        System.out.println(Integer.min(count0, count1));
        bw.flush();
        bw.close();
    }

    

}
